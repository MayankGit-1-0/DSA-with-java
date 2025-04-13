public class customComparator {
    static class Student implements Comparable<Student>{
        int roll_no;
        double percent;
        String name;
        Student(int roll,double per, String name){
            roll_no=roll;
            percent=per;
            this.name=name;

        }
        public int compareTo(Student s){
            return this.roll_no - s.roll_no;
        }

    }
    public static void print(Student[] s){
        for(int i=0;i<s.length;i++){
            System.out.print(s[i].name+" ");
            System.out.print(s[i].roll_no+" ");
            System.out.println(s[i].percent+" ");

        }
    }

    public static void main(String[] args) {
        
        Student[] st=new Student[5];
        st[0]=new Student(1,56,"Shraddha"); 
        st[1]=new Student(2,64,"Anuj"); 
        st[2]=new Student(3,42,"Anju"); 
        st[3]=new Student(4,98,"Khushi"); 
        st[4]=new Student(5,86,"Sneh"); 
        print(st);
        
    }
}