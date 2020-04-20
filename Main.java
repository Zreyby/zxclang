import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        int mem[] = new int[2000];
        int curr_mem_slot = 0;

        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        for (int i = 0; i < code.length(); i++) {
            char curr_command = code.toCharArray()[i];

            switch (curr_command) {
                case '+':
                    mem[curr_mem_slot]++;
                    break;
                case '-':
                    mem[curr_mem_slot]--;
                    break;
                case '<':
                    if(curr_mem_slot == 0)curr_mem_slot = 2000;
                    else curr_mem_slot--;
                    break;
                case '>':
                    if (curr_mem_slot == 2000)curr_mem_slot = 0;
                    else curr_mem_slot++;
                    break;
                case '.':
                    System.out.print((char)(mem[curr_mem_slot]));
                    break;
                case ',':
                    mem[curr_mem_slot] = sc.next().charAt(0);
                    break;
                case '[':

                    break;
                case ']':
                
                    break;
                default:
                    System.out.println("_");
                    break;

            }
        }

    }
}