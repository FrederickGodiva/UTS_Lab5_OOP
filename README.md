```
class Information {
    private String name;
    private String nim;
    private char kom;

    public Information(String name, String nim, char kom) {
        this.name = name;
        this.nim = nim;
        this.kom = kom;
    }

    public String getName() {
        return this.name;
    }

    public String getNim() {
        return this.nim;
    }

    public char getKom() {
        return this.kom;
    }

    public void display() {
        System.out.println("Halo semuanya, perkenalkan saya adalah " + this.getName());
        System.out.print("NIM saya " + this.getNim());
        System.out.println(" dan saya berasal dari Kom " + this.getKom());
    }
}



public class Main {
    public static void main(String[] args) {
        Information me = new Information("Frederick Godiva", "221401038", 'C');
        me.display();
    }
}
```
---

# Soal 1
![image](https://github.com/FrederickGodiva/UTS_Lab5_OOP/assets/114503454/30037237-7f6c-44ec-83c3-0dcf14055019)


<br>

# Soal 2
## Palindrome Checker
![image](https://github.com/FrederickGodiva/UTS_Lab5_OOP/assets/114503454/f7207958-f6e9-47a9-90e2-9adf4d3b2dec)

<br>

## Anagram Checker
![image](https://github.com/FrederickGodiva/UTS_Lab5_OOP/assets/114503454/799f1b67-284e-4abb-a1ce-694f699210c1)

<br>

# Soal 3
## Account
![image](https://github.com/FrederickGodiva/UTS_Lab5_OOP/assets/114503454/319d3994-bb58-4e59-82e9-64af08e2d7a9)

<br>

## Employee
![image](https://github.com/FrederickGodiva/UTS_Lab5_OOP/assets/114503454/2707bb53-4b76-49ce-9b8d-618cbd3dc68f)

<br>

# Soal 4
![image](https://github.com/FrederickGodiva/UTS_Lab5_OOP/assets/114503454/75598348-c01e-4d07-a43a-63b9ff0ed642)
