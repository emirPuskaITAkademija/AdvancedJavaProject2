package seven.thread;
//Thread interferencija
//Thread A i Thread B

//MAIN
// 1. Pristupiti varijabli counter
// 2. Uraditi operaciju izmjene podatka kojem je pristupio
// 3. Vratiti izmijenjeni podatak
//Thread A i Thread B
// 1. Thread A : pristupio counter varijabli i dobio je 0
// 2. Thread B : pristupio counter varijabli i dobio je 0
// 3. Thread A : uvećati sa 0 na 1
// 4. Thread B: umanjiti sa 0 na -1
// 5. Thread A: vratim nazad 1s
// 6. Thread B: vratiti nazad na -1

//HAPPENS BEFORE RELAtioN
public class Counter {

    private volatile  int counter = 0;


    public synchronized  void increment(){
        counter++;
    }

    public synchronized void decrement(){
        counter--;
    }

    public int value(){
        synchronized (this) {
            return counter;
        }
    }
}
