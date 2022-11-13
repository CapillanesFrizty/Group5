/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loadingpage;

/**
 *
 * @author Jenny
 */
public class LoadingPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gymLoading g = new gymLoading();
        g.setVisible(true);
        try {
            for (int i =0; i<=100;i++){
                Thread.sleep(40);
                g.Lpercent.setText(Integer.toString(i)+"%");
                homeSample h = new homeSample();
                if (i == 100){
                    g.dispose();
                    h.show();           //sample lng ni if mo gana ba pang next
                }
            }
        } catch (Exception e) {
        }
    }
    
}
