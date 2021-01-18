/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi_practica1;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.math.plot.Plot2DPanel;

/**
 *
 * @author gerar
 */
public class AbrirImagen extends javax.swing.JFrame {
    private File archivo;
    private BufferedImage img;
    private int ImgAltura, ImgAncho;
    private int formatoColor;
    
    /**
     * Creates new form AbrirImagen
     */
    public AbrirImagen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Visualizador de imágenes");

        jButton2.setText("Ver imágen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del archivo:");

        jButton3.setText("Histogramas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Alto:");

        jLabel6.setText("Ancho:");

        jButton1.setText("test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Seleccionar Imagen");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(393, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(31, 31, 31))
        );

        label1.getAccessibleContext().setAccessibleDescription("");
        jLabel4.getAccessibleContext().setAccessibleName("labelAlto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(img != null){
            MostrarImagen miv = new MostrarImagen(img);
            miv.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "No ha cargado ninguna imágen");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON HISTOGRAMAS
        if(archivo != null){
            if(revisarEscalaGrises() || formatoColor == ColorSpace.CS_GRAY){
                muestraHistogramaGray();
            }else{
                generaHistogramas();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No ha cargado ninguna imágen");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // BOTON SELECCIONAR IMAGEN (EN EL MENU)
        
        ImagePicker i_picker = new ImagePicker();
        archivo = i_picker.getArchivo();
        if(archivo != null){
            jLabel3.setText(archivo.getName());
            try {
                img = ImageIO.read(archivo);
                this.ImgAltura = img.getHeight();
                this.ImgAncho = img.getWidth();
                this.jLabel5.setText(this.ImgAltura+"");
                this.jLabel7.setText(this.ImgAncho+"");
                formatoColor = img.getColorModel().getColorSpace().getType();
            } catch (IOException e) {
                System.out.println("Error al convertir el archivo a iágen:"+e.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON TEST
        if(revisarEscalaGrises()){
            System.out.println("Escala de grises");
        }else{
            System.out.println("No es escala de grises");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private int getRed(int rgb){
        return (rgb>>16)&0x0ff;
    }
    
    private int getGreen(int rgb){
        return (rgb>>8) &0x0ff;
    }
    
    private int getBlue(int rgb){
        return (rgb)    &0x0ff;
    }
    
    private boolean revisarEscalaGrises(){
        Random r = new Random();
        int rgb = img.getRGB(0, 0);
        int red = getRed(rgb);
        int green = getGreen(rgb);
        int blue = getBlue(rgb);
        if(red == green && red == blue){
            rgb = img.getRGB(r.nextInt(this.ImgAncho), r.nextInt(this.ImgAltura));
            red = getRed(rgb);
            green = getGreen(rgb);
            blue = getBlue(rgb);
            return red == green && red == blue;
        }else{
            return false;
        }
    }
    
    private void muestraHistogramaGray(){
        double x[] = new double[256];
        double frecuencias[] = new double[256];
        Plot2DPanel hist = new Plot2DPanel();
        
        hist.setFixedBounds(0, 0, 255);
        
        getFrecuencias(frecuencias);
        //Generamos la matriz que servirá de entrada a la libreria de graficación
        for(int i = 0; i< 256; i++){
            x[i] = i;
        }
        
        hist.addBarPlot("Hist Red",Color.BLACK, x, frecuencias);
        
        //JFrame frame = new JFrame();
        //frame.setContentPane(histBlue);
        //frame.setVisible(true);
        MostrarHistogramas mh = new MostrarHistogramas(hist);
        mh.setVisible(true);
    }
    
    private void generaHistogramas(){
        double x[] = new double[256];
        double frecuenciasRed[] = new double[256];
        double frecuenciasBlue[] = new double[256];
        double frecuenciasGreen[] = new double[256];
        Plot2DPanel histRed = new Plot2DPanel();
        Plot2DPanel histGreen = new Plot2DPanel();
        Plot2DPanel histBlue = new Plot2DPanel();
        
        histRed.setFixedBounds(0, 0, 255);
        histGreen.setFixedBounds(0, 0, 255);
        histBlue.setFixedBounds(0, 0, 255);
        
        getFrecuencias(frecuenciasRed, frecuenciasBlue, frecuenciasGreen);
        //Generamos la matriz que servirá de entrada a la libreria de graficación
        for(int i = 0; i< 256; i++){
            x[i] = i;
        }
        
        histRed.addBarPlot("Hist Red",Color.RED, x, frecuenciasRed);
        histBlue.addBarPlot("Hist Blue",Color.BLUE, x, frecuenciasBlue);
        histGreen.addBarPlot("Histograma Green", Color.GREEN, x, frecuenciasGreen);
        
        //JFrame frame = new JFrame();
        //frame.setContentPane(histBlue);
        //frame.setVisible(true);
        MostrarHistogramas mh = new MostrarHistogramas(histRed, histBlue, histGreen);
        mh.setVisible(true);
    }
    
    private void getFrecuencias(double frecuenciasRed[], double frecuenciasBlue[], double frecuenciasGreen[]){
        
        //Inicializar en 0's
        for (int i = 0; i< 256; i++){
            frecuenciasRed[i]=0;
            frecuenciasBlue[i]=0;
            frecuenciasGreen[i]=0;
        }
        for(int i = 0; i < this.ImgAltura; i++){
            for (int j = 0; j < this.ImgAncho; j++){
                frecuenciasRed[getRed(img.getRGB(j, i))] += 1;
                frecuenciasBlue[getBlue(img.getRGB(j, i))] += 1;
                frecuenciasGreen[getGreen(img.getRGB(j, i))] += 1;
            }
        }
    }
    
    private void getFrecuencias(double frecuencias[]){
        
        //Inicializar en 0's
        for (int i = 0; i< 256; i++){
            frecuencias[i]=0;
        }
        for(int i = 0; i < this.ImgAltura; i++){
            for (int j = 0; j < this.ImgAncho; j++){
                frecuencias[getRed(img.getRGB(j, i))] += 1;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
