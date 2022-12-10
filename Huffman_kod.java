/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//02205076070
//İREM HATİCE DOĞAN


package huffman_kod;

public class Huffman_kod  {

    class Node{
      public  int frequency; 
       public  char data;
       public  Node left, right;
    


void decode(String S ,Node root)
    {
        int[] input = new int[S.length()];
        int index = 0;
        for (char chr:S.toCharArray()){
            input[index++] = chr-48;
        }
        if (input == null || input.length ==0 ){
                return;
            }
            index = 0;
            int num;Node currNode = root;String str = new String();
            while ( index < input.length ){
                num = input[index];
                if (num == 0){
                   
                    currNode = currNode.left;
                }
                else if (num == 1) {
                    
                    currNode = currNode.right;
                }
                if ( currNode.left == null && currNode.right == null ){
                    
                    str += currNode.data;
                    currNode = root;
                }
                index++;
            }
            System.out.println(str);
       
    }}}