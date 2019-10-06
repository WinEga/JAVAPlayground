package OOPS;

interface Play {
    void play(); //public abstract method by default
}


class Cricket implements Play {
    public void play() {
        System.out.println("I am playing Cricket");
    }

}

class Football implements Play {
    public void play() {
        System.out.println("I am playing Football");

    }

}

class Play_something {
    public void play_something(Play p) {
        p.play();
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Play_something pst = new Play_something();
        Play crk = new Cricket();
        Play ftb = new Football();
        pst.play_something(ftb);

    }
}
