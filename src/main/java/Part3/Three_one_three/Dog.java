package Part3.Three_one_three;

public class Dog extends Animal{

    @Override
    public void run(int a) {
        if (a<0){
            System.out.println("������� ����� ������ ��� ����� 0");
        } else if (a>500) {
            System.out.println("������ ������� �� ��������. ������� ����� �� 200");
        } else System.out.println("������ ��������� " +  a + " " + "�.");
    }

    @Override
    public void swim(int a) {
        if (a<0){
            System.out.println("������� ����� ������ ��� ����� 0");
        } else if (a>10) {
            System.out.println("������ ������� �� ���������. ������� ����� �� 10");
        } else System.out.println("������ �������� " +  a + " " + "�.");
    }

}
