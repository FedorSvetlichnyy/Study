package Part3.Three_one_three;

public class Tiger extends Animal{
    @Override
    public void run(int a) {
        if (a<0){
            System.out.println("������� ����� ������ ��� ����� 0");
        } else System.out.println("���� �������� " +  a + " " + "�.");
    }

    @Override
    public void swim(int a) {
        if (a<0){
            System.out.println("������� ����� ������ ��� ����� 0");
        } else System.out.println("���� ������� " +  a + " " + "�.");
    }
}
