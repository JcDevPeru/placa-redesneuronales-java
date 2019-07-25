/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import vocales.Vocales;

/**
 *
 * @author Jean Carlos
 */

public class frmVocal extends javax.swing.JFrame implements MouseListener{

    /**
     * Creates new form frmDigito
     */
    public frmVocal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/matricula.png")).getImage());
        lb00.addMouseListener((MouseListener)this);
        lb01.addMouseListener((MouseListener)this);
        lb02.addMouseListener((MouseListener)this);
        lb03.addMouseListener((MouseListener)this);
        lb04.addMouseListener((MouseListener)this);
        lb10.addMouseListener((MouseListener)this);
        lb11.addMouseListener((MouseListener)this);
        lb12.addMouseListener((MouseListener)this);
        lb13.addMouseListener((MouseListener)this);
        lb14.addMouseListener((MouseListener)this);
        lb20.addMouseListener((MouseListener)this);
        lb21.addMouseListener((MouseListener)this);
        lb22.addMouseListener((MouseListener)this);
        lb23.addMouseListener((MouseListener)this);
        lb24.addMouseListener((MouseListener)this);
        lb30.addMouseListener((MouseListener)this);
        lb31.addMouseListener((MouseListener)this);
        lb32.addMouseListener((MouseListener)this);
        lb33.addMouseListener((MouseListener)this);
        lb34.addMouseListener((MouseListener)this);
        lb40.addMouseListener((MouseListener)this);
        lb41.addMouseListener((MouseListener)this);
        lb42.addMouseListener((MouseListener)this);
        lb43.addMouseListener((MouseListener)this);
        lb44.addMouseListener((MouseListener)this);
        lb50.addMouseListener((MouseListener)this);
        lb51.addMouseListener((MouseListener)this);
        lb52.addMouseListener((MouseListener)this);
        lb53.addMouseListener((MouseListener)this);
        lb54.addMouseListener((MouseListener)this);
        lb60.addMouseListener((MouseListener)this);
        lb61.addMouseListener((MouseListener)this);
        lb62.addMouseListener((MouseListener)this);
        lb63.addMouseListener((MouseListener)this);
        lb64.addMouseListener((MouseListener)this);
        lb1.addMouseListener((MouseListener)this);
        lb2.addMouseListener((MouseListener)this);
        lb3.addMouseListener((MouseListener)this);
        lb4.addMouseListener((MouseListener)this);
        lb5.addMouseListener((MouseListener)this);
        lb15.addMouseListener((MouseListener)this);
        lb16.addMouseListener((MouseListener)this);
        lb17.addMouseListener((MouseListener)this);
        lb18.addMouseListener((MouseListener)this);
        lb19.addMouseListener((MouseListener)this);
        lb25.addMouseListener((MouseListener)this);
        lb26.addMouseListener((MouseListener)this);
        lb27.addMouseListener((MouseListener)this);
        lb28.addMouseListener((MouseListener)this);
        lb29.addMouseListener((MouseListener)this);
        lb35.addMouseListener((MouseListener)this);
        lb36.addMouseListener((MouseListener)this);
        lb37.addMouseListener((MouseListener)this);
        lb38.addMouseListener((MouseListener)this);
        lb39.addMouseListener((MouseListener)this);
        lb45.addMouseListener((MouseListener)this);
        lb46.addMouseListener((MouseListener)this);
        lb47.addMouseListener((MouseListener)this);
        lb48.addMouseListener((MouseListener)this);
        lb49.addMouseListener((MouseListener)this);
        lb55.addMouseListener((MouseListener)this);
        lb56.addMouseListener((MouseListener)this);
        lb57.addMouseListener((MouseListener)this);
        lb58.addMouseListener((MouseListener)this);
        lb59.addMouseListener((MouseListener)this);
        lb65.addMouseListener((MouseListener)this);
        lb66.addMouseListener((MouseListener)this);
        lb67.addMouseListener((MouseListener)this);
        lb68.addMouseListener((MouseListener)this);
        lb69.addMouseListener((MouseListener)this);
        lb6.addMouseListener((MouseListener)this);
        lb7.addMouseListener((MouseListener)this);
        lb8.addMouseListener((MouseListener)this);
        lb9.addMouseListener((MouseListener)this);
        lb70.addMouseListener((MouseListener)this);
        lb71.addMouseListener((MouseListener)this);
        lb72.addMouseListener((MouseListener)this);
        lb73.addMouseListener((MouseListener)this);
        lb74.addMouseListener((MouseListener)this);
        lb75.addMouseListener((MouseListener)this);
        lb76.addMouseListener((MouseListener)this);
        lb77.addMouseListener((MouseListener)this);
        lb78.addMouseListener((MouseListener)this);
        lb79.addMouseListener((MouseListener)this);
        lb80.addMouseListener((MouseListener)this);
        lb81.addMouseListener((MouseListener)this);
        lb82.addMouseListener((MouseListener)this);
        lb83.addMouseListener((MouseListener)this);
        lb84.addMouseListener((MouseListener)this);
        lb85.addMouseListener((MouseListener)this);
        lb86.addMouseListener((MouseListener)this);
        lb87.addMouseListener((MouseListener)this);
        lb88.addMouseListener((MouseListener)this);
        lb89.addMouseListener((MouseListener)this);
        lb90.addMouseListener((MouseListener)this);
        lb91.addMouseListener((MouseListener)this);
        lb92.addMouseListener((MouseListener)this);
        lb93.addMouseListener((MouseListener)this);
        lb94.addMouseListener((MouseListener)this);
        lb95.addMouseListener((MouseListener)this);
        lb96.addMouseListener((MouseListener)this);
        lb97.addMouseListener((MouseListener)this);
        lb98.addMouseListener((MouseListener)this);
        lb99.addMouseListener((MouseListener)this);
        lb100.addMouseListener((MouseListener)this);
        lb101.addMouseListener((MouseListener)this);
        lb102.addMouseListener((MouseListener)this);
        lb103.addMouseListener((MouseListener)this);
        lb104.addMouseListener((MouseListener)this);
        lb105.addMouseListener((MouseListener)this);
        lb106.addMouseListener((MouseListener)this);
        lb107.addMouseListener((MouseListener)this);
        lb108.addMouseListener((MouseListener)this);
        lb109.addMouseListener((MouseListener)this);
        lb110.addMouseListener((MouseListener)this);
        lb111.addMouseListener((MouseListener)this);
        lb112.addMouseListener((MouseListener)this);
        lb113.addMouseListener((MouseListener)this);
        lb114.addMouseListener((MouseListener)this);
        lb115.addMouseListener((MouseListener)this);
        lb116.addMouseListener((MouseListener)this);
        lb117.addMouseListener((MouseListener)this);
        lb118.addMouseListener((MouseListener)this);
        lb119.addMouseListener((MouseListener)this);
        lb120.addMouseListener((MouseListener)this);
        lb121.addMouseListener((MouseListener)this);
        lb122.addMouseListener((MouseListener)this);
        lb123.addMouseListener((MouseListener)this);
        lb124.addMouseListener((MouseListener)this);
        lb125.addMouseListener((MouseListener)this);
        lb126.addMouseListener((MouseListener)this);
        lb127.addMouseListener((MouseListener)this);
        lb128.addMouseListener((MouseListener)this);
        lb129.addMouseListener((MouseListener)this);
        lb130.addMouseListener((MouseListener)this);
        lb131.addMouseListener((MouseListener)this);
        lb132.addMouseListener((MouseListener)this);
        lb133.addMouseListener((MouseListener)this);
        lb134.addMouseListener((MouseListener)this);
        lb135.addMouseListener((MouseListener)this);
        lb136.addMouseListener((MouseListener)this);
        lb137.addMouseListener((MouseListener)this);
        lb138.addMouseListener((MouseListener)this);
        lb139.addMouseListener((MouseListener)this);
        lb140.addMouseListener((MouseListener)this);
        lb141.addMouseListener((MouseListener)this);
        lb142.addMouseListener((MouseListener)this);
        lb143.addMouseListener((MouseListener)this);
        lb144.addMouseListener((MouseListener)this);
        lb145.addMouseListener((MouseListener)this);
        lb146.addMouseListener((MouseListener)this);
        lb147.addMouseListener((MouseListener)this);
        lb148.addMouseListener((MouseListener)this);
        lb149.addMouseListener((MouseListener)this);
        lb150.addMouseListener((MouseListener)this);
        lb151.addMouseListener((MouseListener)this);
        lb152.addMouseListener((MouseListener)this);
        lb153.addMouseListener((MouseListener)this);
        lb154.addMouseListener((MouseListener)this);
        lb155.addMouseListener((MouseListener)this);
        lb156.addMouseListener((MouseListener)this);
        lb157.addMouseListener((MouseListener)this);
        lb158.addMouseListener((MouseListener)this);
        lb159.addMouseListener((MouseListener)this);
        lb160.addMouseListener((MouseListener)this);
        lb161.addMouseListener((MouseListener)this);
        lb162.addMouseListener((MouseListener)this);
        lb163.addMouseListener((MouseListener)this);
        lb164.addMouseListener((MouseListener)this);
        lb165.addMouseListener((MouseListener)this);
        lb166.addMouseListener((MouseListener)this);
        lb167.addMouseListener((MouseListener)this);
        lb168.addMouseListener((MouseListener)this);
        lb169.addMouseListener((MouseListener)this);
        lb170.addMouseListener((MouseListener)this);
        lb171.addMouseListener((MouseListener)this);
        lb172.addMouseListener((MouseListener)this);
        lb173.addMouseListener((MouseListener)this);
        lb174.addMouseListener((MouseListener)this);
        lb175.addMouseListener((MouseListener)this);
        lb176.addMouseListener((MouseListener)this);
        lb177.addMouseListener((MouseListener)this);
        lb178.addMouseListener((MouseListener)this);
        lb179.addMouseListener((MouseListener)this);
        lb180.addMouseListener((MouseListener)this);
        lb181.addMouseListener((MouseListener)this);
        lb182.addMouseListener((MouseListener)this);
        lb183.addMouseListener((MouseListener)this);
        lb184.addMouseListener((MouseListener)this);
        lb185.addMouseListener((MouseListener)this);
        lb186.addMouseListener((MouseListener)this);
        lb187.addMouseListener((MouseListener)this);
        lb188.addMouseListener((MouseListener)this);
        lb189.addMouseListener((MouseListener)this);
        lb190.addMouseListener((MouseListener)this);
        lb191.addMouseListener((MouseListener)this);
        lb192.addMouseListener((MouseListener)this);
        lb193.addMouseListener((MouseListener)this);
        lb194.addMouseListener((MouseListener)this);
        lb195.addMouseListener((MouseListener)this);
        lb196.addMouseListener((MouseListener)this);
        lb197.addMouseListener((MouseListener)this);
        lb198.addMouseListener((MouseListener)this);
        lb199.addMouseListener((MouseListener)this);
        lb200.addMouseListener((MouseListener)this);
        lb201.addMouseListener((MouseListener)this);
        lb202.addMouseListener((MouseListener)this);
        lb203.addMouseListener((MouseListener)this);
        lb204.addMouseListener((MouseListener)this);
        lb205.addMouseListener((MouseListener)this);
        
        
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb00 = new javax.swing.JLabel();
        lb01 = new javax.swing.JLabel();
        lb02 = new javax.swing.JLabel();
        lb03 = new javax.swing.JLabel();
        lb04 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        lb20 = new javax.swing.JLabel();
        lb21 = new javax.swing.JLabel();
        lb22 = new javax.swing.JLabel();
        lb23 = new javax.swing.JLabel();
        lb24 = new javax.swing.JLabel();
        lb30 = new javax.swing.JLabel();
        lb31 = new javax.swing.JLabel();
        lb32 = new javax.swing.JLabel();
        lb33 = new javax.swing.JLabel();
        lb34 = new javax.swing.JLabel();
        lb40 = new javax.swing.JLabel();
        lb41 = new javax.swing.JLabel();
        lb42 = new javax.swing.JLabel();
        lb43 = new javax.swing.JLabel();
        lb44 = new javax.swing.JLabel();
        lb50 = new javax.swing.JLabel();
        lb51 = new javax.swing.JLabel();
        lb52 = new javax.swing.JLabel();
        lb53 = new javax.swing.JLabel();
        lb54 = new javax.swing.JLabel();
        lb60 = new javax.swing.JLabel();
        lb61 = new javax.swing.JLabel();
        lb62 = new javax.swing.JLabel();
        lb63 = new javax.swing.JLabel();
        lb64 = new javax.swing.JLabel();
        btnAnalizar = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb15 = new javax.swing.JLabel();
        lb16 = new javax.swing.JLabel();
        lb17 = new javax.swing.JLabel();
        lb18 = new javax.swing.JLabel();
        lb19 = new javax.swing.JLabel();
        lb25 = new javax.swing.JLabel();
        lb26 = new javax.swing.JLabel();
        lb27 = new javax.swing.JLabel();
        lb28 = new javax.swing.JLabel();
        lb29 = new javax.swing.JLabel();
        lb35 = new javax.swing.JLabel();
        lb36 = new javax.swing.JLabel();
        lb37 = new javax.swing.JLabel();
        lb38 = new javax.swing.JLabel();
        lb39 = new javax.swing.JLabel();
        lb45 = new javax.swing.JLabel();
        lb46 = new javax.swing.JLabel();
        lb47 = new javax.swing.JLabel();
        lb48 = new javax.swing.JLabel();
        lb49 = new javax.swing.JLabel();
        lb55 = new javax.swing.JLabel();
        lb56 = new javax.swing.JLabel();
        lb57 = new javax.swing.JLabel();
        lb58 = new javax.swing.JLabel();
        lb59 = new javax.swing.JLabel();
        lb65 = new javax.swing.JLabel();
        lb66 = new javax.swing.JLabel();
        lb67 = new javax.swing.JLabel();
        lb68 = new javax.swing.JLabel();
        lb69 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb70 = new javax.swing.JLabel();
        lb71 = new javax.swing.JLabel();
        lb72 = new javax.swing.JLabel();
        lb73 = new javax.swing.JLabel();
        lb74 = new javax.swing.JLabel();
        lb75 = new javax.swing.JLabel();
        lb76 = new javax.swing.JLabel();
        lb77 = new javax.swing.JLabel();
        lb78 = new javax.swing.JLabel();
        lb79 = new javax.swing.JLabel();
        lb80 = new javax.swing.JLabel();
        lb81 = new javax.swing.JLabel();
        lb82 = new javax.swing.JLabel();
        lb83 = new javax.swing.JLabel();
        lb84 = new javax.swing.JLabel();
        lb85 = new javax.swing.JLabel();
        lb86 = new javax.swing.JLabel();
        lb87 = new javax.swing.JLabel();
        lb88 = new javax.swing.JLabel();
        lb89 = new javax.swing.JLabel();
        lb90 = new javax.swing.JLabel();
        lb91 = new javax.swing.JLabel();
        lb92 = new javax.swing.JLabel();
        lb93 = new javax.swing.JLabel();
        lb94 = new javax.swing.JLabel();
        lb95 = new javax.swing.JLabel();
        lb96 = new javax.swing.JLabel();
        lb97 = new javax.swing.JLabel();
        lb98 = new javax.swing.JLabel();
        lb99 = new javax.swing.JLabel();
        lb100 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lb101 = new javax.swing.JLabel();
        lb102 = new javax.swing.JLabel();
        lb103 = new javax.swing.JLabel();
        lb104 = new javax.swing.JLabel();
        lb105 = new javax.swing.JLabel();
        lb106 = new javax.swing.JLabel();
        lb107 = new javax.swing.JLabel();
        lb108 = new javax.swing.JLabel();
        lb109 = new javax.swing.JLabel();
        lb110 = new javax.swing.JLabel();
        lb111 = new javax.swing.JLabel();
        lb112 = new javax.swing.JLabel();
        lb113 = new javax.swing.JLabel();
        lb114 = new javax.swing.JLabel();
        lb115 = new javax.swing.JLabel();
        lb116 = new javax.swing.JLabel();
        lb117 = new javax.swing.JLabel();
        lb118 = new javax.swing.JLabel();
        lb119 = new javax.swing.JLabel();
        lb120 = new javax.swing.JLabel();
        lb121 = new javax.swing.JLabel();
        lb122 = new javax.swing.JLabel();
        lb123 = new javax.swing.JLabel();
        lb124 = new javax.swing.JLabel();
        lb125 = new javax.swing.JLabel();
        lb126 = new javax.swing.JLabel();
        lb127 = new javax.swing.JLabel();
        lb128 = new javax.swing.JLabel();
        lb129 = new javax.swing.JLabel();
        lb130 = new javax.swing.JLabel();
        lb131 = new javax.swing.JLabel();
        lb132 = new javax.swing.JLabel();
        lb133 = new javax.swing.JLabel();
        lb134 = new javax.swing.JLabel();
        lb135 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lb136 = new javax.swing.JLabel();
        lb137 = new javax.swing.JLabel();
        lb138 = new javax.swing.JLabel();
        lb139 = new javax.swing.JLabel();
        lb140 = new javax.swing.JLabel();
        lb141 = new javax.swing.JLabel();
        lb142 = new javax.swing.JLabel();
        lb143 = new javax.swing.JLabel();
        lb144 = new javax.swing.JLabel();
        lb145 = new javax.swing.JLabel();
        lb146 = new javax.swing.JLabel();
        lb147 = new javax.swing.JLabel();
        lb148 = new javax.swing.JLabel();
        lb149 = new javax.swing.JLabel();
        lb150 = new javax.swing.JLabel();
        lb151 = new javax.swing.JLabel();
        lb152 = new javax.swing.JLabel();
        lb153 = new javax.swing.JLabel();
        lb154 = new javax.swing.JLabel();
        lb155 = new javax.swing.JLabel();
        lb156 = new javax.swing.JLabel();
        lb157 = new javax.swing.JLabel();
        lb158 = new javax.swing.JLabel();
        lb159 = new javax.swing.JLabel();
        lb160 = new javax.swing.JLabel();
        lb161 = new javax.swing.JLabel();
        lb162 = new javax.swing.JLabel();
        lb163 = new javax.swing.JLabel();
        lb164 = new javax.swing.JLabel();
        lb165 = new javax.swing.JLabel();
        lb166 = new javax.swing.JLabel();
        lb167 = new javax.swing.JLabel();
        lb168 = new javax.swing.JLabel();
        lb169 = new javax.swing.JLabel();
        lb170 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lb171 = new javax.swing.JLabel();
        lb172 = new javax.swing.JLabel();
        lb173 = new javax.swing.JLabel();
        lb174 = new javax.swing.JLabel();
        lb175 = new javax.swing.JLabel();
        lb176 = new javax.swing.JLabel();
        lb177 = new javax.swing.JLabel();
        lb178 = new javax.swing.JLabel();
        lb179 = new javax.swing.JLabel();
        lb180 = new javax.swing.JLabel();
        lb181 = new javax.swing.JLabel();
        lb182 = new javax.swing.JLabel();
        lb183 = new javax.swing.JLabel();
        lb184 = new javax.swing.JLabel();
        lb185 = new javax.swing.JLabel();
        lb186 = new javax.swing.JLabel();
        lb187 = new javax.swing.JLabel();
        lb188 = new javax.swing.JLabel();
        lb189 = new javax.swing.JLabel();
        lb190 = new javax.swing.JLabel();
        lb191 = new javax.swing.JLabel();
        lb192 = new javax.swing.JLabel();
        lb193 = new javax.swing.JLabel();
        lb194 = new javax.swing.JLabel();
        lb195 = new javax.swing.JLabel();
        lb196 = new javax.swing.JLabel();
        lb197 = new javax.swing.JLabel();
        lb198 = new javax.swing.JLabel();
        lb199 = new javax.swing.JLabel();
        lb200 = new javax.swing.JLabel();
        lb201 = new javax.swing.JLabel();
        lb202 = new javax.swing.JLabel();
        lb203 = new javax.swing.JLabel();
        lb204 = new javax.swing.JLabel();
        lb205 = new javax.swing.JLabel();
        lbplaca = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(400, 300));
        setMinimumSize(new java.awt.Dimension(174, 238));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb00.setBackground(new java.awt.Color(255, 255, 255));
        lb00.setToolTipText("");
        lb00.setMaximumSize(new java.awt.Dimension(30, 30));
        lb00.setMinimumSize(new java.awt.Dimension(30, 30));
        lb00.setName("0"); // NOI18N
        lb00.setOpaque(true);
        lb00.setPreferredSize(new java.awt.Dimension(30, 30));

        lb01.setBackground(new java.awt.Color(255, 255, 255));
        lb01.setToolTipText("");
        lb01.setMaximumSize(new java.awt.Dimension(30, 30));
        lb01.setMinimumSize(new java.awt.Dimension(30, 30));
        lb01.setName("0"); // NOI18N
        lb01.setOpaque(true);
        lb01.setPreferredSize(new java.awt.Dimension(30, 30));

        lb02.setBackground(new java.awt.Color(255, 255, 255));
        lb02.setToolTipText("");
        lb02.setMaximumSize(new java.awt.Dimension(30, 30));
        lb02.setMinimumSize(new java.awt.Dimension(30, 30));
        lb02.setName("0"); // NOI18N
        lb02.setOpaque(true);
        lb02.setPreferredSize(new java.awt.Dimension(30, 30));

        lb03.setBackground(new java.awt.Color(255, 255, 255));
        lb03.setToolTipText("");
        lb03.setMaximumSize(new java.awt.Dimension(30, 30));
        lb03.setMinimumSize(new java.awt.Dimension(30, 30));
        lb03.setName("0"); // NOI18N
        lb03.setOpaque(true);
        lb03.setPreferredSize(new java.awt.Dimension(30, 30));

        lb04.setBackground(new java.awt.Color(255, 255, 255));
        lb04.setToolTipText("");
        lb04.setMaximumSize(new java.awt.Dimension(30, 30));
        lb04.setMinimumSize(new java.awt.Dimension(30, 30));
        lb04.setName("0"); // NOI18N
        lb04.setOpaque(true);
        lb04.setPreferredSize(new java.awt.Dimension(30, 30));

        lb10.setBackground(new java.awt.Color(255, 255, 255));
        lb10.setToolTipText("");
        lb10.setMaximumSize(new java.awt.Dimension(30, 30));
        lb10.setMinimumSize(new java.awt.Dimension(30, 30));
        lb10.setName("0"); // NOI18N
        lb10.setOpaque(true);
        lb10.setPreferredSize(new java.awt.Dimension(30, 30));

        lb11.setBackground(new java.awt.Color(255, 255, 255));
        lb11.setToolTipText("");
        lb11.setMaximumSize(new java.awt.Dimension(30, 30));
        lb11.setMinimumSize(new java.awt.Dimension(30, 30));
        lb11.setName("0"); // NOI18N
        lb11.setOpaque(true);
        lb11.setPreferredSize(new java.awt.Dimension(30, 30));

        lb12.setBackground(new java.awt.Color(255, 255, 255));
        lb12.setToolTipText("");
        lb12.setMaximumSize(new java.awt.Dimension(30, 30));
        lb12.setMinimumSize(new java.awt.Dimension(30, 30));
        lb12.setName("0"); // NOI18N
        lb12.setOpaque(true);
        lb12.setPreferredSize(new java.awt.Dimension(30, 30));

        lb13.setBackground(new java.awt.Color(255, 255, 255));
        lb13.setToolTipText("");
        lb13.setMaximumSize(new java.awt.Dimension(30, 30));
        lb13.setMinimumSize(new java.awt.Dimension(30, 30));
        lb13.setName("0"); // NOI18N
        lb13.setOpaque(true);
        lb13.setPreferredSize(new java.awt.Dimension(30, 30));

        lb14.setBackground(new java.awt.Color(255, 255, 255));
        lb14.setToolTipText("");
        lb14.setMaximumSize(new java.awt.Dimension(30, 30));
        lb14.setMinimumSize(new java.awt.Dimension(30, 30));
        lb14.setName("0"); // NOI18N
        lb14.setOpaque(true);
        lb14.setPreferredSize(new java.awt.Dimension(30, 30));

        lb20.setBackground(new java.awt.Color(255, 255, 255));
        lb20.setToolTipText("");
        lb20.setMaximumSize(new java.awt.Dimension(30, 30));
        lb20.setMinimumSize(new java.awt.Dimension(30, 30));
        lb20.setName("0"); // NOI18N
        lb20.setOpaque(true);
        lb20.setPreferredSize(new java.awt.Dimension(30, 30));

        lb21.setBackground(new java.awt.Color(255, 255, 255));
        lb21.setToolTipText("");
        lb21.setMaximumSize(new java.awt.Dimension(30, 30));
        lb21.setMinimumSize(new java.awt.Dimension(30, 30));
        lb21.setName("0"); // NOI18N
        lb21.setOpaque(true);
        lb21.setPreferredSize(new java.awt.Dimension(30, 30));

        lb22.setBackground(new java.awt.Color(255, 255, 255));
        lb22.setToolTipText("");
        lb22.setMaximumSize(new java.awt.Dimension(30, 30));
        lb22.setMinimumSize(new java.awt.Dimension(30, 30));
        lb22.setName("0"); // NOI18N
        lb22.setOpaque(true);
        lb22.setPreferredSize(new java.awt.Dimension(30, 30));

        lb23.setBackground(new java.awt.Color(255, 255, 255));
        lb23.setToolTipText("");
        lb23.setMaximumSize(new java.awt.Dimension(30, 30));
        lb23.setMinimumSize(new java.awt.Dimension(30, 30));
        lb23.setName("0"); // NOI18N
        lb23.setOpaque(true);
        lb23.setPreferredSize(new java.awt.Dimension(30, 30));

        lb24.setBackground(new java.awt.Color(255, 255, 255));
        lb24.setToolTipText("");
        lb24.setMaximumSize(new java.awt.Dimension(30, 30));
        lb24.setMinimumSize(new java.awt.Dimension(30, 30));
        lb24.setName("0"); // NOI18N
        lb24.setOpaque(true);
        lb24.setPreferredSize(new java.awt.Dimension(30, 30));

        lb30.setBackground(new java.awt.Color(255, 255, 255));
        lb30.setToolTipText("");
        lb30.setMaximumSize(new java.awt.Dimension(30, 30));
        lb30.setMinimumSize(new java.awt.Dimension(30, 30));
        lb30.setName("0"); // NOI18N
        lb30.setOpaque(true);
        lb30.setPreferredSize(new java.awt.Dimension(30, 30));

        lb31.setBackground(new java.awt.Color(255, 255, 255));
        lb31.setToolTipText("");
        lb31.setMaximumSize(new java.awt.Dimension(30, 30));
        lb31.setMinimumSize(new java.awt.Dimension(30, 30));
        lb31.setName("0"); // NOI18N
        lb31.setOpaque(true);
        lb31.setPreferredSize(new java.awt.Dimension(30, 30));

        lb32.setBackground(new java.awt.Color(255, 255, 255));
        lb32.setToolTipText("");
        lb32.setMaximumSize(new java.awt.Dimension(30, 30));
        lb32.setMinimumSize(new java.awt.Dimension(30, 30));
        lb32.setName("0"); // NOI18N
        lb32.setOpaque(true);
        lb32.setPreferredSize(new java.awt.Dimension(30, 30));

        lb33.setBackground(new java.awt.Color(255, 255, 255));
        lb33.setToolTipText("");
        lb33.setMaximumSize(new java.awt.Dimension(30, 30));
        lb33.setMinimumSize(new java.awt.Dimension(30, 30));
        lb33.setName("0"); // NOI18N
        lb33.setOpaque(true);
        lb33.setPreferredSize(new java.awt.Dimension(30, 30));

        lb34.setBackground(new java.awt.Color(255, 255, 255));
        lb34.setToolTipText("");
        lb34.setMaximumSize(new java.awt.Dimension(30, 30));
        lb34.setMinimumSize(new java.awt.Dimension(30, 30));
        lb34.setName("0"); // NOI18N
        lb34.setOpaque(true);
        lb34.setPreferredSize(new java.awt.Dimension(30, 30));

        lb40.setBackground(new java.awt.Color(255, 255, 255));
        lb40.setToolTipText("");
        lb40.setMaximumSize(new java.awt.Dimension(30, 30));
        lb40.setMinimumSize(new java.awt.Dimension(30, 30));
        lb40.setName("0"); // NOI18N
        lb40.setOpaque(true);
        lb40.setPreferredSize(new java.awt.Dimension(30, 30));

        lb41.setBackground(new java.awt.Color(255, 255, 255));
        lb41.setToolTipText("");
        lb41.setMaximumSize(new java.awt.Dimension(30, 30));
        lb41.setMinimumSize(new java.awt.Dimension(30, 30));
        lb41.setName("0"); // NOI18N
        lb41.setOpaque(true);
        lb41.setPreferredSize(new java.awt.Dimension(30, 30));

        lb42.setBackground(new java.awt.Color(255, 255, 255));
        lb42.setToolTipText("");
        lb42.setMaximumSize(new java.awt.Dimension(30, 30));
        lb42.setMinimumSize(new java.awt.Dimension(30, 30));
        lb42.setName("0"); // NOI18N
        lb42.setOpaque(true);
        lb42.setPreferredSize(new java.awt.Dimension(30, 30));

        lb43.setBackground(new java.awt.Color(255, 255, 255));
        lb43.setToolTipText("");
        lb43.setMaximumSize(new java.awt.Dimension(30, 30));
        lb43.setMinimumSize(new java.awt.Dimension(30, 30));
        lb43.setName("0"); // NOI18N
        lb43.setOpaque(true);
        lb43.setPreferredSize(new java.awt.Dimension(30, 30));

        lb44.setBackground(new java.awt.Color(255, 255, 255));
        lb44.setToolTipText("");
        lb44.setMaximumSize(new java.awt.Dimension(30, 30));
        lb44.setMinimumSize(new java.awt.Dimension(30, 30));
        lb44.setName("0"); // NOI18N
        lb44.setOpaque(true);
        lb44.setPreferredSize(new java.awt.Dimension(30, 30));

        lb50.setBackground(new java.awt.Color(255, 255, 255));
        lb50.setToolTipText("");
        lb50.setMaximumSize(new java.awt.Dimension(30, 30));
        lb50.setMinimumSize(new java.awt.Dimension(30, 30));
        lb50.setName("0"); // NOI18N
        lb50.setOpaque(true);
        lb50.setPreferredSize(new java.awt.Dimension(30, 30));

        lb51.setBackground(new java.awt.Color(255, 255, 255));
        lb51.setToolTipText("");
        lb51.setMaximumSize(new java.awt.Dimension(30, 30));
        lb51.setMinimumSize(new java.awt.Dimension(30, 30));
        lb51.setName("0"); // NOI18N
        lb51.setOpaque(true);
        lb51.setPreferredSize(new java.awt.Dimension(30, 30));

        lb52.setBackground(new java.awt.Color(255, 255, 255));
        lb52.setToolTipText("");
        lb52.setMaximumSize(new java.awt.Dimension(30, 30));
        lb52.setMinimumSize(new java.awt.Dimension(30, 30));
        lb52.setName("0"); // NOI18N
        lb52.setOpaque(true);
        lb52.setPreferredSize(new java.awt.Dimension(30, 30));

        lb53.setBackground(new java.awt.Color(255, 255, 255));
        lb53.setToolTipText("");
        lb53.setMaximumSize(new java.awt.Dimension(30, 30));
        lb53.setMinimumSize(new java.awt.Dimension(30, 30));
        lb53.setName("0"); // NOI18N
        lb53.setOpaque(true);
        lb53.setPreferredSize(new java.awt.Dimension(30, 30));

        lb54.setBackground(new java.awt.Color(255, 255, 255));
        lb54.setToolTipText("");
        lb54.setMaximumSize(new java.awt.Dimension(30, 30));
        lb54.setMinimumSize(new java.awt.Dimension(30, 30));
        lb54.setName("0"); // NOI18N
        lb54.setOpaque(true);
        lb54.setPreferredSize(new java.awt.Dimension(30, 30));

        lb60.setBackground(new java.awt.Color(255, 255, 255));
        lb60.setToolTipText("");
        lb60.setMaximumSize(new java.awt.Dimension(30, 30));
        lb60.setMinimumSize(new java.awt.Dimension(30, 30));
        lb60.setName("0"); // NOI18N
        lb60.setOpaque(true);
        lb60.setPreferredSize(new java.awt.Dimension(30, 30));

        lb61.setBackground(new java.awt.Color(255, 255, 255));
        lb61.setToolTipText("");
        lb61.setMaximumSize(new java.awt.Dimension(30, 30));
        lb61.setMinimumSize(new java.awt.Dimension(30, 30));
        lb61.setName("0"); // NOI18N
        lb61.setOpaque(true);
        lb61.setPreferredSize(new java.awt.Dimension(30, 30));

        lb62.setBackground(new java.awt.Color(255, 255, 255));
        lb62.setToolTipText("");
        lb62.setMaximumSize(new java.awt.Dimension(30, 30));
        lb62.setMinimumSize(new java.awt.Dimension(30, 30));
        lb62.setName("0"); // NOI18N
        lb62.setOpaque(true);
        lb62.setPreferredSize(new java.awt.Dimension(30, 30));

        lb63.setBackground(new java.awt.Color(255, 255, 255));
        lb63.setToolTipText("");
        lb63.setMaximumSize(new java.awt.Dimension(30, 30));
        lb63.setMinimumSize(new java.awt.Dimension(30, 30));
        lb63.setName("0"); // NOI18N
        lb63.setOpaque(true);
        lb63.setPreferredSize(new java.awt.Dimension(30, 30));

        lb64.setBackground(new java.awt.Color(255, 255, 255));
        lb64.setToolTipText("");
        lb64.setMaximumSize(new java.awt.Dimension(30, 30));
        lb64.setMinimumSize(new java.awt.Dimension(30, 30));
        lb64.setName("0"); // NOI18N
        lb64.setOpaque(true);
        lb64.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnAnalizar.setFont(new java.awt.Font("Felix Titling", 1, 13)); // NOI18N
        btnAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comprobado.png"))); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        btnClean.setFont(new java.awt.Font("Felix Titling", 1, 13)); // NOI18N
        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/escoba-de-limpieza-para-suelos.png"))); // NOI18N
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb1.setBackground(new java.awt.Color(255, 255, 255));
        lb1.setToolTipText("");
        lb1.setMaximumSize(new java.awt.Dimension(30, 30));
        lb1.setMinimumSize(new java.awt.Dimension(30, 30));
        lb1.setName("0"); // NOI18N
        lb1.setOpaque(true);
        lb1.setPreferredSize(new java.awt.Dimension(30, 30));

        lb2.setBackground(new java.awt.Color(255, 255, 255));
        lb2.setToolTipText("");
        lb2.setMaximumSize(new java.awt.Dimension(30, 30));
        lb2.setMinimumSize(new java.awt.Dimension(30, 30));
        lb2.setName("0"); // NOI18N
        lb2.setOpaque(true);
        lb2.setPreferredSize(new java.awt.Dimension(30, 30));

        lb3.setBackground(new java.awt.Color(255, 255, 255));
        lb3.setToolTipText("");
        lb3.setMaximumSize(new java.awt.Dimension(30, 30));
        lb3.setMinimumSize(new java.awt.Dimension(30, 30));
        lb3.setName("0"); // NOI18N
        lb3.setOpaque(true);
        lb3.setPreferredSize(new java.awt.Dimension(30, 30));

        lb4.setBackground(new java.awt.Color(255, 255, 255));
        lb4.setToolTipText("");
        lb4.setMaximumSize(new java.awt.Dimension(30, 30));
        lb4.setMinimumSize(new java.awt.Dimension(30, 30));
        lb4.setName("0"); // NOI18N
        lb4.setOpaque(true);
        lb4.setPreferredSize(new java.awt.Dimension(30, 30));

        lb5.setBackground(new java.awt.Color(255, 255, 255));
        lb5.setToolTipText("");
        lb5.setMaximumSize(new java.awt.Dimension(30, 30));
        lb5.setMinimumSize(new java.awt.Dimension(30, 30));
        lb5.setName("0"); // NOI18N
        lb5.setOpaque(true);
        lb5.setPreferredSize(new java.awt.Dimension(30, 30));

        lb15.setBackground(new java.awt.Color(255, 255, 255));
        lb15.setToolTipText("");
        lb15.setMaximumSize(new java.awt.Dimension(30, 30));
        lb15.setMinimumSize(new java.awt.Dimension(30, 30));
        lb15.setName("0"); // NOI18N
        lb15.setOpaque(true);
        lb15.setPreferredSize(new java.awt.Dimension(30, 30));

        lb16.setBackground(new java.awt.Color(255, 255, 255));
        lb16.setToolTipText("");
        lb16.setMaximumSize(new java.awt.Dimension(30, 30));
        lb16.setMinimumSize(new java.awt.Dimension(30, 30));
        lb16.setName("0"); // NOI18N
        lb16.setOpaque(true);
        lb16.setPreferredSize(new java.awt.Dimension(30, 30));

        lb17.setBackground(new java.awt.Color(255, 255, 255));
        lb17.setToolTipText("");
        lb17.setMaximumSize(new java.awt.Dimension(30, 30));
        lb17.setMinimumSize(new java.awt.Dimension(30, 30));
        lb17.setName("0"); // NOI18N
        lb17.setOpaque(true);
        lb17.setPreferredSize(new java.awt.Dimension(30, 30));

        lb18.setBackground(new java.awt.Color(255, 255, 255));
        lb18.setToolTipText("");
        lb18.setMaximumSize(new java.awt.Dimension(30, 30));
        lb18.setMinimumSize(new java.awt.Dimension(30, 30));
        lb18.setName("0"); // NOI18N
        lb18.setOpaque(true);
        lb18.setPreferredSize(new java.awt.Dimension(30, 30));

        lb19.setBackground(new java.awt.Color(255, 255, 255));
        lb19.setToolTipText("");
        lb19.setMaximumSize(new java.awt.Dimension(30, 30));
        lb19.setMinimumSize(new java.awt.Dimension(30, 30));
        lb19.setName("0"); // NOI18N
        lb19.setOpaque(true);
        lb19.setPreferredSize(new java.awt.Dimension(30, 30));

        lb25.setBackground(new java.awt.Color(255, 255, 255));
        lb25.setToolTipText("");
        lb25.setMaximumSize(new java.awt.Dimension(30, 30));
        lb25.setMinimumSize(new java.awt.Dimension(30, 30));
        lb25.setName("0"); // NOI18N
        lb25.setOpaque(true);
        lb25.setPreferredSize(new java.awt.Dimension(30, 30));

        lb26.setBackground(new java.awt.Color(255, 255, 255));
        lb26.setToolTipText("");
        lb26.setMaximumSize(new java.awt.Dimension(30, 30));
        lb26.setMinimumSize(new java.awt.Dimension(30, 30));
        lb26.setName("0"); // NOI18N
        lb26.setOpaque(true);
        lb26.setPreferredSize(new java.awt.Dimension(30, 30));

        lb27.setBackground(new java.awt.Color(255, 255, 255));
        lb27.setToolTipText("");
        lb27.setMaximumSize(new java.awt.Dimension(30, 30));
        lb27.setMinimumSize(new java.awt.Dimension(30, 30));
        lb27.setName("0"); // NOI18N
        lb27.setOpaque(true);
        lb27.setPreferredSize(new java.awt.Dimension(30, 30));

        lb28.setBackground(new java.awt.Color(255, 255, 255));
        lb28.setToolTipText("");
        lb28.setMaximumSize(new java.awt.Dimension(30, 30));
        lb28.setMinimumSize(new java.awt.Dimension(30, 30));
        lb28.setName("0"); // NOI18N
        lb28.setOpaque(true);
        lb28.setPreferredSize(new java.awt.Dimension(30, 30));

        lb29.setBackground(new java.awt.Color(255, 255, 255));
        lb29.setToolTipText("");
        lb29.setMaximumSize(new java.awt.Dimension(30, 30));
        lb29.setMinimumSize(new java.awt.Dimension(30, 30));
        lb29.setName("0"); // NOI18N
        lb29.setOpaque(true);
        lb29.setPreferredSize(new java.awt.Dimension(30, 30));

        lb35.setBackground(new java.awt.Color(255, 255, 255));
        lb35.setToolTipText("");
        lb35.setMaximumSize(new java.awt.Dimension(30, 30));
        lb35.setMinimumSize(new java.awt.Dimension(30, 30));
        lb35.setName("0"); // NOI18N
        lb35.setOpaque(true);
        lb35.setPreferredSize(new java.awt.Dimension(30, 30));

        lb36.setBackground(new java.awt.Color(255, 255, 255));
        lb36.setToolTipText("");
        lb36.setMaximumSize(new java.awt.Dimension(30, 30));
        lb36.setMinimumSize(new java.awt.Dimension(30, 30));
        lb36.setName("0"); // NOI18N
        lb36.setOpaque(true);
        lb36.setPreferredSize(new java.awt.Dimension(30, 30));

        lb37.setBackground(new java.awt.Color(255, 255, 255));
        lb37.setToolTipText("");
        lb37.setMaximumSize(new java.awt.Dimension(30, 30));
        lb37.setMinimumSize(new java.awt.Dimension(30, 30));
        lb37.setName("0"); // NOI18N
        lb37.setOpaque(true);
        lb37.setPreferredSize(new java.awt.Dimension(30, 30));

        lb38.setBackground(new java.awt.Color(255, 255, 255));
        lb38.setToolTipText("");
        lb38.setMaximumSize(new java.awt.Dimension(30, 30));
        lb38.setMinimumSize(new java.awt.Dimension(30, 30));
        lb38.setName("0"); // NOI18N
        lb38.setOpaque(true);
        lb38.setPreferredSize(new java.awt.Dimension(30, 30));

        lb39.setBackground(new java.awt.Color(255, 255, 255));
        lb39.setToolTipText("");
        lb39.setMaximumSize(new java.awt.Dimension(30, 30));
        lb39.setMinimumSize(new java.awt.Dimension(30, 30));
        lb39.setName("0"); // NOI18N
        lb39.setOpaque(true);
        lb39.setPreferredSize(new java.awt.Dimension(30, 30));

        lb45.setBackground(new java.awt.Color(255, 255, 255));
        lb45.setToolTipText("");
        lb45.setMaximumSize(new java.awt.Dimension(30, 30));
        lb45.setMinimumSize(new java.awt.Dimension(30, 30));
        lb45.setName("0"); // NOI18N
        lb45.setOpaque(true);
        lb45.setPreferredSize(new java.awt.Dimension(30, 30));

        lb46.setBackground(new java.awt.Color(255, 255, 255));
        lb46.setToolTipText("");
        lb46.setMaximumSize(new java.awt.Dimension(30, 30));
        lb46.setMinimumSize(new java.awt.Dimension(30, 30));
        lb46.setName("0"); // NOI18N
        lb46.setOpaque(true);
        lb46.setPreferredSize(new java.awt.Dimension(30, 30));

        lb47.setBackground(new java.awt.Color(255, 255, 255));
        lb47.setToolTipText("");
        lb47.setMaximumSize(new java.awt.Dimension(30, 30));
        lb47.setMinimumSize(new java.awt.Dimension(30, 30));
        lb47.setName("0"); // NOI18N
        lb47.setOpaque(true);
        lb47.setPreferredSize(new java.awt.Dimension(30, 30));

        lb48.setBackground(new java.awt.Color(255, 255, 255));
        lb48.setToolTipText("");
        lb48.setMaximumSize(new java.awt.Dimension(30, 30));
        lb48.setMinimumSize(new java.awt.Dimension(30, 30));
        lb48.setName("0"); // NOI18N
        lb48.setOpaque(true);
        lb48.setPreferredSize(new java.awt.Dimension(30, 30));

        lb49.setBackground(new java.awt.Color(255, 255, 255));
        lb49.setToolTipText("");
        lb49.setMaximumSize(new java.awt.Dimension(30, 30));
        lb49.setMinimumSize(new java.awt.Dimension(30, 30));
        lb49.setName("0"); // NOI18N
        lb49.setOpaque(true);
        lb49.setPreferredSize(new java.awt.Dimension(30, 30));

        lb55.setBackground(new java.awt.Color(255, 255, 255));
        lb55.setToolTipText("");
        lb55.setMaximumSize(new java.awt.Dimension(30, 30));
        lb55.setMinimumSize(new java.awt.Dimension(30, 30));
        lb55.setName("0"); // NOI18N
        lb55.setOpaque(true);
        lb55.setPreferredSize(new java.awt.Dimension(30, 30));

        lb56.setBackground(new java.awt.Color(255, 255, 255));
        lb56.setToolTipText("");
        lb56.setMaximumSize(new java.awt.Dimension(30, 30));
        lb56.setMinimumSize(new java.awt.Dimension(30, 30));
        lb56.setName("0"); // NOI18N
        lb56.setOpaque(true);
        lb56.setPreferredSize(new java.awt.Dimension(30, 30));

        lb57.setBackground(new java.awt.Color(255, 255, 255));
        lb57.setToolTipText("");
        lb57.setMaximumSize(new java.awt.Dimension(30, 30));
        lb57.setMinimumSize(new java.awt.Dimension(30, 30));
        lb57.setName("0"); // NOI18N
        lb57.setOpaque(true);
        lb57.setPreferredSize(new java.awt.Dimension(30, 30));

        lb58.setBackground(new java.awt.Color(255, 255, 255));
        lb58.setToolTipText("");
        lb58.setMaximumSize(new java.awt.Dimension(30, 30));
        lb58.setMinimumSize(new java.awt.Dimension(30, 30));
        lb58.setName("0"); // NOI18N
        lb58.setOpaque(true);
        lb58.setPreferredSize(new java.awt.Dimension(30, 30));

        lb59.setBackground(new java.awt.Color(255, 255, 255));
        lb59.setToolTipText("");
        lb59.setMaximumSize(new java.awt.Dimension(30, 30));
        lb59.setMinimumSize(new java.awt.Dimension(30, 30));
        lb59.setName("0"); // NOI18N
        lb59.setOpaque(true);
        lb59.setPreferredSize(new java.awt.Dimension(30, 30));

        lb65.setBackground(new java.awt.Color(255, 255, 255));
        lb65.setToolTipText("");
        lb65.setMaximumSize(new java.awt.Dimension(30, 30));
        lb65.setMinimumSize(new java.awt.Dimension(30, 30));
        lb65.setName("0"); // NOI18N
        lb65.setOpaque(true);
        lb65.setPreferredSize(new java.awt.Dimension(30, 30));

        lb66.setBackground(new java.awt.Color(255, 255, 255));
        lb66.setToolTipText("");
        lb66.setMaximumSize(new java.awt.Dimension(30, 30));
        lb66.setMinimumSize(new java.awt.Dimension(30, 30));
        lb66.setName("0"); // NOI18N
        lb66.setOpaque(true);
        lb66.setPreferredSize(new java.awt.Dimension(30, 30));

        lb67.setBackground(new java.awt.Color(255, 255, 255));
        lb67.setToolTipText("");
        lb67.setMaximumSize(new java.awt.Dimension(30, 30));
        lb67.setMinimumSize(new java.awt.Dimension(30, 30));
        lb67.setName("0"); // NOI18N
        lb67.setOpaque(true);
        lb67.setPreferredSize(new java.awt.Dimension(30, 30));

        lb68.setBackground(new java.awt.Color(255, 255, 255));
        lb68.setToolTipText("");
        lb68.setMaximumSize(new java.awt.Dimension(30, 30));
        lb68.setMinimumSize(new java.awt.Dimension(30, 30));
        lb68.setName("0"); // NOI18N
        lb68.setOpaque(true);
        lb68.setPreferredSize(new java.awt.Dimension(30, 30));

        lb69.setBackground(new java.awt.Color(255, 255, 255));
        lb69.setToolTipText("");
        lb69.setMaximumSize(new java.awt.Dimension(30, 30));
        lb69.setMinimumSize(new java.awt.Dimension(30, 30));
        lb69.setName("0"); // NOI18N
        lb69.setOpaque(true);
        lb69.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb6.setBackground(new java.awt.Color(255, 255, 255));
        lb6.setToolTipText("");
        lb6.setMaximumSize(new java.awt.Dimension(30, 30));
        lb6.setMinimumSize(new java.awt.Dimension(30, 30));
        lb6.setName("0"); // NOI18N
        lb6.setOpaque(true);
        lb6.setPreferredSize(new java.awt.Dimension(30, 30));

        lb7.setBackground(new java.awt.Color(255, 255, 255));
        lb7.setToolTipText("");
        lb7.setMaximumSize(new java.awt.Dimension(30, 30));
        lb7.setMinimumSize(new java.awt.Dimension(30, 30));
        lb7.setName("0"); // NOI18N
        lb7.setOpaque(true);
        lb7.setPreferredSize(new java.awt.Dimension(30, 30));

        lb8.setBackground(new java.awt.Color(255, 255, 255));
        lb8.setToolTipText("");
        lb8.setMaximumSize(new java.awt.Dimension(30, 30));
        lb8.setMinimumSize(new java.awt.Dimension(30, 30));
        lb8.setName("0"); // NOI18N
        lb8.setOpaque(true);
        lb8.setPreferredSize(new java.awt.Dimension(30, 30));

        lb9.setBackground(new java.awt.Color(255, 255, 255));
        lb9.setToolTipText("");
        lb9.setMaximumSize(new java.awt.Dimension(30, 30));
        lb9.setMinimumSize(new java.awt.Dimension(30, 30));
        lb9.setName("0"); // NOI18N
        lb9.setOpaque(true);
        lb9.setPreferredSize(new java.awt.Dimension(30, 30));

        lb70.setBackground(new java.awt.Color(255, 255, 255));
        lb70.setToolTipText("");
        lb70.setMaximumSize(new java.awt.Dimension(30, 30));
        lb70.setMinimumSize(new java.awt.Dimension(30, 30));
        lb70.setName("0"); // NOI18N
        lb70.setOpaque(true);
        lb70.setPreferredSize(new java.awt.Dimension(30, 30));

        lb71.setBackground(new java.awt.Color(255, 255, 255));
        lb71.setToolTipText("");
        lb71.setMaximumSize(new java.awt.Dimension(30, 30));
        lb71.setMinimumSize(new java.awt.Dimension(30, 30));
        lb71.setName("0"); // NOI18N
        lb71.setOpaque(true);
        lb71.setPreferredSize(new java.awt.Dimension(30, 30));

        lb72.setBackground(new java.awt.Color(255, 255, 255));
        lb72.setToolTipText("");
        lb72.setMaximumSize(new java.awt.Dimension(30, 30));
        lb72.setMinimumSize(new java.awt.Dimension(30, 30));
        lb72.setName("0"); // NOI18N
        lb72.setOpaque(true);
        lb72.setPreferredSize(new java.awt.Dimension(30, 30));

        lb73.setBackground(new java.awt.Color(255, 255, 255));
        lb73.setToolTipText("");
        lb73.setMaximumSize(new java.awt.Dimension(30, 30));
        lb73.setMinimumSize(new java.awt.Dimension(30, 30));
        lb73.setName("0"); // NOI18N
        lb73.setOpaque(true);
        lb73.setPreferredSize(new java.awt.Dimension(30, 30));

        lb74.setBackground(new java.awt.Color(255, 255, 255));
        lb74.setToolTipText("");
        lb74.setMaximumSize(new java.awt.Dimension(30, 30));
        lb74.setMinimumSize(new java.awt.Dimension(30, 30));
        lb74.setName("0"); // NOI18N
        lb74.setOpaque(true);
        lb74.setPreferredSize(new java.awt.Dimension(30, 30));

        lb75.setBackground(new java.awt.Color(255, 255, 255));
        lb75.setToolTipText("");
        lb75.setMaximumSize(new java.awt.Dimension(30, 30));
        lb75.setMinimumSize(new java.awt.Dimension(30, 30));
        lb75.setName("0"); // NOI18N
        lb75.setOpaque(true);
        lb75.setPreferredSize(new java.awt.Dimension(30, 30));

        lb76.setBackground(new java.awt.Color(255, 255, 255));
        lb76.setToolTipText("");
        lb76.setMaximumSize(new java.awt.Dimension(30, 30));
        lb76.setMinimumSize(new java.awt.Dimension(30, 30));
        lb76.setName("0"); // NOI18N
        lb76.setOpaque(true);
        lb76.setPreferredSize(new java.awt.Dimension(30, 30));

        lb77.setBackground(new java.awt.Color(255, 255, 255));
        lb77.setToolTipText("");
        lb77.setMaximumSize(new java.awt.Dimension(30, 30));
        lb77.setMinimumSize(new java.awt.Dimension(30, 30));
        lb77.setName("0"); // NOI18N
        lb77.setOpaque(true);
        lb77.setPreferredSize(new java.awt.Dimension(30, 30));

        lb78.setBackground(new java.awt.Color(255, 255, 255));
        lb78.setToolTipText("");
        lb78.setMaximumSize(new java.awt.Dimension(30, 30));
        lb78.setMinimumSize(new java.awt.Dimension(30, 30));
        lb78.setName("0"); // NOI18N
        lb78.setOpaque(true);
        lb78.setPreferredSize(new java.awt.Dimension(30, 30));

        lb79.setBackground(new java.awt.Color(255, 255, 255));
        lb79.setToolTipText("");
        lb79.setMaximumSize(new java.awt.Dimension(30, 30));
        lb79.setMinimumSize(new java.awt.Dimension(30, 30));
        lb79.setName("0"); // NOI18N
        lb79.setOpaque(true);
        lb79.setPreferredSize(new java.awt.Dimension(30, 30));

        lb80.setBackground(new java.awt.Color(255, 255, 255));
        lb80.setToolTipText("");
        lb80.setMaximumSize(new java.awt.Dimension(30, 30));
        lb80.setMinimumSize(new java.awt.Dimension(30, 30));
        lb80.setName("0"); // NOI18N
        lb80.setOpaque(true);
        lb80.setPreferredSize(new java.awt.Dimension(30, 30));

        lb81.setBackground(new java.awt.Color(255, 255, 255));
        lb81.setToolTipText("");
        lb81.setMaximumSize(new java.awt.Dimension(30, 30));
        lb81.setMinimumSize(new java.awt.Dimension(30, 30));
        lb81.setName("0"); // NOI18N
        lb81.setOpaque(true);
        lb81.setPreferredSize(new java.awt.Dimension(30, 30));

        lb82.setBackground(new java.awt.Color(255, 255, 255));
        lb82.setToolTipText("");
        lb82.setMaximumSize(new java.awt.Dimension(30, 30));
        lb82.setMinimumSize(new java.awt.Dimension(30, 30));
        lb82.setName("0"); // NOI18N
        lb82.setOpaque(true);
        lb82.setPreferredSize(new java.awt.Dimension(30, 30));

        lb83.setBackground(new java.awt.Color(255, 255, 255));
        lb83.setToolTipText("");
        lb83.setMaximumSize(new java.awt.Dimension(30, 30));
        lb83.setMinimumSize(new java.awt.Dimension(30, 30));
        lb83.setName("0"); // NOI18N
        lb83.setOpaque(true);
        lb83.setPreferredSize(new java.awt.Dimension(30, 30));

        lb84.setBackground(new java.awt.Color(255, 255, 255));
        lb84.setToolTipText("");
        lb84.setMaximumSize(new java.awt.Dimension(30, 30));
        lb84.setMinimumSize(new java.awt.Dimension(30, 30));
        lb84.setName("0"); // NOI18N
        lb84.setOpaque(true);
        lb84.setPreferredSize(new java.awt.Dimension(30, 30));

        lb85.setBackground(new java.awt.Color(255, 255, 255));
        lb85.setToolTipText("");
        lb85.setMaximumSize(new java.awt.Dimension(30, 30));
        lb85.setMinimumSize(new java.awt.Dimension(30, 30));
        lb85.setName("0"); // NOI18N
        lb85.setOpaque(true);
        lb85.setPreferredSize(new java.awt.Dimension(30, 30));

        lb86.setBackground(new java.awt.Color(255, 255, 255));
        lb86.setToolTipText("");
        lb86.setMaximumSize(new java.awt.Dimension(30, 30));
        lb86.setMinimumSize(new java.awt.Dimension(30, 30));
        lb86.setName("0"); // NOI18N
        lb86.setOpaque(true);
        lb86.setPreferredSize(new java.awt.Dimension(30, 30));

        lb87.setBackground(new java.awt.Color(255, 255, 255));
        lb87.setToolTipText("");
        lb87.setMaximumSize(new java.awt.Dimension(30, 30));
        lb87.setMinimumSize(new java.awt.Dimension(30, 30));
        lb87.setName("0"); // NOI18N
        lb87.setOpaque(true);
        lb87.setPreferredSize(new java.awt.Dimension(30, 30));

        lb88.setBackground(new java.awt.Color(255, 255, 255));
        lb88.setToolTipText("");
        lb88.setMaximumSize(new java.awt.Dimension(30, 30));
        lb88.setMinimumSize(new java.awt.Dimension(30, 30));
        lb88.setName("0"); // NOI18N
        lb88.setOpaque(true);
        lb88.setPreferredSize(new java.awt.Dimension(30, 30));

        lb89.setBackground(new java.awt.Color(255, 255, 255));
        lb89.setToolTipText("");
        lb89.setMaximumSize(new java.awt.Dimension(30, 30));
        lb89.setMinimumSize(new java.awt.Dimension(30, 30));
        lb89.setName("0"); // NOI18N
        lb89.setOpaque(true);
        lb89.setPreferredSize(new java.awt.Dimension(30, 30));

        lb90.setBackground(new java.awt.Color(255, 255, 255));
        lb90.setToolTipText("");
        lb90.setMaximumSize(new java.awt.Dimension(30, 30));
        lb90.setMinimumSize(new java.awt.Dimension(30, 30));
        lb90.setName("0"); // NOI18N
        lb90.setOpaque(true);
        lb90.setPreferredSize(new java.awt.Dimension(30, 30));

        lb91.setBackground(new java.awt.Color(255, 255, 255));
        lb91.setToolTipText("");
        lb91.setMaximumSize(new java.awt.Dimension(30, 30));
        lb91.setMinimumSize(new java.awt.Dimension(30, 30));
        lb91.setName("0"); // NOI18N
        lb91.setOpaque(true);
        lb91.setPreferredSize(new java.awt.Dimension(30, 30));

        lb92.setBackground(new java.awt.Color(255, 255, 255));
        lb92.setToolTipText("");
        lb92.setMaximumSize(new java.awt.Dimension(30, 30));
        lb92.setMinimumSize(new java.awt.Dimension(30, 30));
        lb92.setName("0"); // NOI18N
        lb92.setOpaque(true);
        lb92.setPreferredSize(new java.awt.Dimension(30, 30));

        lb93.setBackground(new java.awt.Color(255, 255, 255));
        lb93.setToolTipText("");
        lb93.setMaximumSize(new java.awt.Dimension(30, 30));
        lb93.setMinimumSize(new java.awt.Dimension(30, 30));
        lb93.setName("0"); // NOI18N
        lb93.setOpaque(true);
        lb93.setPreferredSize(new java.awt.Dimension(30, 30));

        lb94.setBackground(new java.awt.Color(255, 255, 255));
        lb94.setToolTipText("");
        lb94.setMaximumSize(new java.awt.Dimension(30, 30));
        lb94.setMinimumSize(new java.awt.Dimension(30, 30));
        lb94.setName("0"); // NOI18N
        lb94.setOpaque(true);
        lb94.setPreferredSize(new java.awt.Dimension(30, 30));

        lb95.setBackground(new java.awt.Color(255, 255, 255));
        lb95.setToolTipText("");
        lb95.setMaximumSize(new java.awt.Dimension(30, 30));
        lb95.setMinimumSize(new java.awt.Dimension(30, 30));
        lb95.setName("0"); // NOI18N
        lb95.setOpaque(true);
        lb95.setPreferredSize(new java.awt.Dimension(30, 30));

        lb96.setBackground(new java.awt.Color(255, 255, 255));
        lb96.setToolTipText("");
        lb96.setMaximumSize(new java.awt.Dimension(30, 30));
        lb96.setMinimumSize(new java.awt.Dimension(30, 30));
        lb96.setName("0"); // NOI18N
        lb96.setOpaque(true);
        lb96.setPreferredSize(new java.awt.Dimension(30, 30));

        lb97.setBackground(new java.awt.Color(255, 255, 255));
        lb97.setToolTipText("");
        lb97.setMaximumSize(new java.awt.Dimension(30, 30));
        lb97.setMinimumSize(new java.awt.Dimension(30, 30));
        lb97.setName("0"); // NOI18N
        lb97.setOpaque(true);
        lb97.setPreferredSize(new java.awt.Dimension(30, 30));

        lb98.setBackground(new java.awt.Color(255, 255, 255));
        lb98.setToolTipText("");
        lb98.setMaximumSize(new java.awt.Dimension(30, 30));
        lb98.setMinimumSize(new java.awt.Dimension(30, 30));
        lb98.setName("0"); // NOI18N
        lb98.setOpaque(true);
        lb98.setPreferredSize(new java.awt.Dimension(30, 30));

        lb99.setBackground(new java.awt.Color(255, 255, 255));
        lb99.setToolTipText("");
        lb99.setMaximumSize(new java.awt.Dimension(30, 30));
        lb99.setMinimumSize(new java.awt.Dimension(30, 30));
        lb99.setName("0"); // NOI18N
        lb99.setOpaque(true);
        lb99.setPreferredSize(new java.awt.Dimension(30, 30));

        lb100.setBackground(new java.awt.Color(255, 255, 255));
        lb100.setToolTipText("");
        lb100.setMaximumSize(new java.awt.Dimension(30, 30));
        lb100.setMinimumSize(new java.awt.Dimension(30, 30));
        lb100.setName("0"); // NOI18N
        lb100.setOpaque(true);
        lb100.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lb96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb101.setBackground(new java.awt.Color(255, 255, 255));
        lb101.setToolTipText("");
        lb101.setMaximumSize(new java.awt.Dimension(30, 30));
        lb101.setMinimumSize(new java.awt.Dimension(30, 30));
        lb101.setName("0"); // NOI18N
        lb101.setOpaque(true);
        lb101.setPreferredSize(new java.awt.Dimension(30, 30));

        lb102.setBackground(new java.awt.Color(255, 255, 255));
        lb102.setToolTipText("");
        lb102.setMaximumSize(new java.awt.Dimension(30, 30));
        lb102.setMinimumSize(new java.awt.Dimension(30, 30));
        lb102.setName("0"); // NOI18N
        lb102.setOpaque(true);
        lb102.setPreferredSize(new java.awt.Dimension(30, 30));

        lb103.setBackground(new java.awt.Color(255, 255, 255));
        lb103.setToolTipText("");
        lb103.setMaximumSize(new java.awt.Dimension(30, 30));
        lb103.setMinimumSize(new java.awt.Dimension(30, 30));
        lb103.setName("0"); // NOI18N
        lb103.setOpaque(true);
        lb103.setPreferredSize(new java.awt.Dimension(30, 30));

        lb104.setBackground(new java.awt.Color(255, 255, 255));
        lb104.setToolTipText("");
        lb104.setMaximumSize(new java.awt.Dimension(30, 30));
        lb104.setMinimumSize(new java.awt.Dimension(30, 30));
        lb104.setName("0"); // NOI18N
        lb104.setOpaque(true);
        lb104.setPreferredSize(new java.awt.Dimension(30, 30));

        lb105.setBackground(new java.awt.Color(255, 255, 255));
        lb105.setToolTipText("");
        lb105.setMaximumSize(new java.awt.Dimension(30, 30));
        lb105.setMinimumSize(new java.awt.Dimension(30, 30));
        lb105.setName("0"); // NOI18N
        lb105.setOpaque(true);
        lb105.setPreferredSize(new java.awt.Dimension(30, 30));

        lb106.setBackground(new java.awt.Color(255, 255, 255));
        lb106.setToolTipText("");
        lb106.setMaximumSize(new java.awt.Dimension(30, 30));
        lb106.setMinimumSize(new java.awt.Dimension(30, 30));
        lb106.setName("0"); // NOI18N
        lb106.setOpaque(true);
        lb106.setPreferredSize(new java.awt.Dimension(30, 30));

        lb107.setBackground(new java.awt.Color(255, 255, 255));
        lb107.setToolTipText("");
        lb107.setMaximumSize(new java.awt.Dimension(30, 30));
        lb107.setMinimumSize(new java.awt.Dimension(30, 30));
        lb107.setName("0"); // NOI18N
        lb107.setOpaque(true);
        lb107.setPreferredSize(new java.awt.Dimension(30, 30));

        lb108.setBackground(new java.awt.Color(255, 255, 255));
        lb108.setToolTipText("");
        lb108.setMaximumSize(new java.awt.Dimension(30, 30));
        lb108.setMinimumSize(new java.awt.Dimension(30, 30));
        lb108.setName("0"); // NOI18N
        lb108.setOpaque(true);
        lb108.setPreferredSize(new java.awt.Dimension(30, 30));

        lb109.setBackground(new java.awt.Color(255, 255, 255));
        lb109.setToolTipText("");
        lb109.setMaximumSize(new java.awt.Dimension(30, 30));
        lb109.setMinimumSize(new java.awt.Dimension(30, 30));
        lb109.setName("0"); // NOI18N
        lb109.setOpaque(true);
        lb109.setPreferredSize(new java.awt.Dimension(30, 30));

        lb110.setBackground(new java.awt.Color(255, 255, 255));
        lb110.setToolTipText("");
        lb110.setMaximumSize(new java.awt.Dimension(30, 30));
        lb110.setMinimumSize(new java.awt.Dimension(30, 30));
        lb110.setName("0"); // NOI18N
        lb110.setOpaque(true);
        lb110.setPreferredSize(new java.awt.Dimension(30, 30));

        lb111.setBackground(new java.awt.Color(255, 255, 255));
        lb111.setToolTipText("");
        lb111.setMaximumSize(new java.awt.Dimension(30, 30));
        lb111.setMinimumSize(new java.awt.Dimension(30, 30));
        lb111.setName("0"); // NOI18N
        lb111.setOpaque(true);
        lb111.setPreferredSize(new java.awt.Dimension(30, 30));

        lb112.setBackground(new java.awt.Color(255, 255, 255));
        lb112.setToolTipText("");
        lb112.setMaximumSize(new java.awt.Dimension(30, 30));
        lb112.setMinimumSize(new java.awt.Dimension(30, 30));
        lb112.setName("0"); // NOI18N
        lb112.setOpaque(true);
        lb112.setPreferredSize(new java.awt.Dimension(30, 30));

        lb113.setBackground(new java.awt.Color(255, 255, 255));
        lb113.setToolTipText("");
        lb113.setMaximumSize(new java.awt.Dimension(30, 30));
        lb113.setMinimumSize(new java.awt.Dimension(30, 30));
        lb113.setName("0"); // NOI18N
        lb113.setOpaque(true);
        lb113.setPreferredSize(new java.awt.Dimension(30, 30));

        lb114.setBackground(new java.awt.Color(255, 255, 255));
        lb114.setToolTipText("");
        lb114.setMaximumSize(new java.awt.Dimension(30, 30));
        lb114.setMinimumSize(new java.awt.Dimension(30, 30));
        lb114.setName("0"); // NOI18N
        lb114.setOpaque(true);
        lb114.setPreferredSize(new java.awt.Dimension(30, 30));

        lb115.setBackground(new java.awt.Color(255, 255, 255));
        lb115.setToolTipText("");
        lb115.setMaximumSize(new java.awt.Dimension(30, 30));
        lb115.setMinimumSize(new java.awt.Dimension(30, 30));
        lb115.setName("0"); // NOI18N
        lb115.setOpaque(true);
        lb115.setPreferredSize(new java.awt.Dimension(30, 30));

        lb116.setBackground(new java.awt.Color(255, 255, 255));
        lb116.setToolTipText("");
        lb116.setMaximumSize(new java.awt.Dimension(30, 30));
        lb116.setMinimumSize(new java.awt.Dimension(30, 30));
        lb116.setName("0"); // NOI18N
        lb116.setOpaque(true);
        lb116.setPreferredSize(new java.awt.Dimension(30, 30));

        lb117.setBackground(new java.awt.Color(255, 255, 255));
        lb117.setToolTipText("");
        lb117.setMaximumSize(new java.awt.Dimension(30, 30));
        lb117.setMinimumSize(new java.awt.Dimension(30, 30));
        lb117.setName("0"); // NOI18N
        lb117.setOpaque(true);
        lb117.setPreferredSize(new java.awt.Dimension(30, 30));

        lb118.setBackground(new java.awt.Color(255, 255, 255));
        lb118.setToolTipText("");
        lb118.setMaximumSize(new java.awt.Dimension(30, 30));
        lb118.setMinimumSize(new java.awt.Dimension(30, 30));
        lb118.setName("0"); // NOI18N
        lb118.setOpaque(true);
        lb118.setPreferredSize(new java.awt.Dimension(30, 30));

        lb119.setBackground(new java.awt.Color(255, 255, 255));
        lb119.setToolTipText("");
        lb119.setMaximumSize(new java.awt.Dimension(30, 30));
        lb119.setMinimumSize(new java.awt.Dimension(30, 30));
        lb119.setName("0"); // NOI18N
        lb119.setOpaque(true);
        lb119.setPreferredSize(new java.awt.Dimension(30, 30));

        lb120.setBackground(new java.awt.Color(255, 255, 255));
        lb120.setToolTipText("");
        lb120.setMaximumSize(new java.awt.Dimension(30, 30));
        lb120.setMinimumSize(new java.awt.Dimension(30, 30));
        lb120.setName("0"); // NOI18N
        lb120.setOpaque(true);
        lb120.setPreferredSize(new java.awt.Dimension(30, 30));

        lb121.setBackground(new java.awt.Color(255, 255, 255));
        lb121.setToolTipText("");
        lb121.setMaximumSize(new java.awt.Dimension(30, 30));
        lb121.setMinimumSize(new java.awt.Dimension(30, 30));
        lb121.setName("0"); // NOI18N
        lb121.setOpaque(true);
        lb121.setPreferredSize(new java.awt.Dimension(30, 30));

        lb122.setBackground(new java.awt.Color(255, 255, 255));
        lb122.setToolTipText("");
        lb122.setMaximumSize(new java.awt.Dimension(30, 30));
        lb122.setMinimumSize(new java.awt.Dimension(30, 30));
        lb122.setName("0"); // NOI18N
        lb122.setOpaque(true);
        lb122.setPreferredSize(new java.awt.Dimension(30, 30));

        lb123.setBackground(new java.awt.Color(255, 255, 255));
        lb123.setToolTipText("");
        lb123.setMaximumSize(new java.awt.Dimension(30, 30));
        lb123.setMinimumSize(new java.awt.Dimension(30, 30));
        lb123.setName("0"); // NOI18N
        lb123.setOpaque(true);
        lb123.setPreferredSize(new java.awt.Dimension(30, 30));

        lb124.setBackground(new java.awt.Color(255, 255, 255));
        lb124.setToolTipText("");
        lb124.setMaximumSize(new java.awt.Dimension(30, 30));
        lb124.setMinimumSize(new java.awt.Dimension(30, 30));
        lb124.setName("0"); // NOI18N
        lb124.setOpaque(true);
        lb124.setPreferredSize(new java.awt.Dimension(30, 30));

        lb125.setBackground(new java.awt.Color(255, 255, 255));
        lb125.setToolTipText("");
        lb125.setMaximumSize(new java.awt.Dimension(30, 30));
        lb125.setMinimumSize(new java.awt.Dimension(30, 30));
        lb125.setName("0"); // NOI18N
        lb125.setOpaque(true);
        lb125.setPreferredSize(new java.awt.Dimension(30, 30));

        lb126.setBackground(new java.awt.Color(255, 255, 255));
        lb126.setToolTipText("");
        lb126.setMaximumSize(new java.awt.Dimension(30, 30));
        lb126.setMinimumSize(new java.awt.Dimension(30, 30));
        lb126.setName("0"); // NOI18N
        lb126.setOpaque(true);
        lb126.setPreferredSize(new java.awt.Dimension(30, 30));

        lb127.setBackground(new java.awt.Color(255, 255, 255));
        lb127.setToolTipText("");
        lb127.setMaximumSize(new java.awt.Dimension(30, 30));
        lb127.setMinimumSize(new java.awt.Dimension(30, 30));
        lb127.setName("0"); // NOI18N
        lb127.setOpaque(true);
        lb127.setPreferredSize(new java.awt.Dimension(30, 30));

        lb128.setBackground(new java.awt.Color(255, 255, 255));
        lb128.setToolTipText("");
        lb128.setMaximumSize(new java.awt.Dimension(30, 30));
        lb128.setMinimumSize(new java.awt.Dimension(30, 30));
        lb128.setName("0"); // NOI18N
        lb128.setOpaque(true);
        lb128.setPreferredSize(new java.awt.Dimension(30, 30));

        lb129.setBackground(new java.awt.Color(255, 255, 255));
        lb129.setToolTipText("");
        lb129.setMaximumSize(new java.awt.Dimension(30, 30));
        lb129.setMinimumSize(new java.awt.Dimension(30, 30));
        lb129.setName("0"); // NOI18N
        lb129.setOpaque(true);
        lb129.setPreferredSize(new java.awt.Dimension(30, 30));

        lb130.setBackground(new java.awt.Color(255, 255, 255));
        lb130.setToolTipText("");
        lb130.setMaximumSize(new java.awt.Dimension(30, 30));
        lb130.setMinimumSize(new java.awt.Dimension(30, 30));
        lb130.setName("0"); // NOI18N
        lb130.setOpaque(true);
        lb130.setPreferredSize(new java.awt.Dimension(30, 30));

        lb131.setBackground(new java.awt.Color(255, 255, 255));
        lb131.setToolTipText("");
        lb131.setMaximumSize(new java.awt.Dimension(30, 30));
        lb131.setMinimumSize(new java.awt.Dimension(30, 30));
        lb131.setName("0"); // NOI18N
        lb131.setOpaque(true);
        lb131.setPreferredSize(new java.awt.Dimension(30, 30));

        lb132.setBackground(new java.awt.Color(255, 255, 255));
        lb132.setToolTipText("");
        lb132.setMaximumSize(new java.awt.Dimension(30, 30));
        lb132.setMinimumSize(new java.awt.Dimension(30, 30));
        lb132.setName("0"); // NOI18N
        lb132.setOpaque(true);
        lb132.setPreferredSize(new java.awt.Dimension(30, 30));

        lb133.setBackground(new java.awt.Color(255, 255, 255));
        lb133.setToolTipText("");
        lb133.setMaximumSize(new java.awt.Dimension(30, 30));
        lb133.setMinimumSize(new java.awt.Dimension(30, 30));
        lb133.setName("0"); // NOI18N
        lb133.setOpaque(true);
        lb133.setPreferredSize(new java.awt.Dimension(30, 30));

        lb134.setBackground(new java.awt.Color(255, 255, 255));
        lb134.setToolTipText("");
        lb134.setMaximumSize(new java.awt.Dimension(30, 30));
        lb134.setMinimumSize(new java.awt.Dimension(30, 30));
        lb134.setName("0"); // NOI18N
        lb134.setOpaque(true);
        lb134.setPreferredSize(new java.awt.Dimension(30, 30));

        lb135.setBackground(new java.awt.Color(255, 255, 255));
        lb135.setToolTipText("");
        lb135.setMaximumSize(new java.awt.Dimension(30, 30));
        lb135.setMinimumSize(new java.awt.Dimension(30, 30));
        lb135.setName("0"); // NOI18N
        lb135.setOpaque(true);
        lb135.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb136.setBackground(new java.awt.Color(255, 255, 255));
        lb136.setToolTipText("");
        lb136.setMaximumSize(new java.awt.Dimension(30, 30));
        lb136.setMinimumSize(new java.awt.Dimension(30, 30));
        lb136.setName("0"); // NOI18N
        lb136.setOpaque(true);
        lb136.setPreferredSize(new java.awt.Dimension(30, 30));

        lb137.setBackground(new java.awt.Color(255, 255, 255));
        lb137.setToolTipText("");
        lb137.setMaximumSize(new java.awt.Dimension(30, 30));
        lb137.setMinimumSize(new java.awt.Dimension(30, 30));
        lb137.setName("0"); // NOI18N
        lb137.setOpaque(true);
        lb137.setPreferredSize(new java.awt.Dimension(30, 30));

        lb138.setBackground(new java.awt.Color(255, 255, 255));
        lb138.setToolTipText("");
        lb138.setMaximumSize(new java.awt.Dimension(30, 30));
        lb138.setMinimumSize(new java.awt.Dimension(30, 30));
        lb138.setName("0"); // NOI18N
        lb138.setOpaque(true);
        lb138.setPreferredSize(new java.awt.Dimension(30, 30));

        lb139.setBackground(new java.awt.Color(255, 255, 255));
        lb139.setToolTipText("");
        lb139.setMaximumSize(new java.awt.Dimension(30, 30));
        lb139.setMinimumSize(new java.awt.Dimension(30, 30));
        lb139.setName("0"); // NOI18N
        lb139.setOpaque(true);
        lb139.setPreferredSize(new java.awt.Dimension(30, 30));

        lb140.setBackground(new java.awt.Color(255, 255, 255));
        lb140.setToolTipText("");
        lb140.setMaximumSize(new java.awt.Dimension(30, 30));
        lb140.setMinimumSize(new java.awt.Dimension(30, 30));
        lb140.setName("0"); // NOI18N
        lb140.setOpaque(true);
        lb140.setPreferredSize(new java.awt.Dimension(30, 30));

        lb141.setBackground(new java.awt.Color(255, 255, 255));
        lb141.setToolTipText("");
        lb141.setMaximumSize(new java.awt.Dimension(30, 30));
        lb141.setMinimumSize(new java.awt.Dimension(30, 30));
        lb141.setName("0"); // NOI18N
        lb141.setOpaque(true);
        lb141.setPreferredSize(new java.awt.Dimension(30, 30));

        lb142.setBackground(new java.awt.Color(255, 255, 255));
        lb142.setToolTipText("");
        lb142.setMaximumSize(new java.awt.Dimension(30, 30));
        lb142.setMinimumSize(new java.awt.Dimension(30, 30));
        lb142.setName("0"); // NOI18N
        lb142.setOpaque(true);
        lb142.setPreferredSize(new java.awt.Dimension(30, 30));

        lb143.setBackground(new java.awt.Color(255, 255, 255));
        lb143.setToolTipText("");
        lb143.setMaximumSize(new java.awt.Dimension(30, 30));
        lb143.setMinimumSize(new java.awt.Dimension(30, 30));
        lb143.setName("0"); // NOI18N
        lb143.setOpaque(true);
        lb143.setPreferredSize(new java.awt.Dimension(30, 30));

        lb144.setBackground(new java.awt.Color(255, 255, 255));
        lb144.setToolTipText("");
        lb144.setMaximumSize(new java.awt.Dimension(30, 30));
        lb144.setMinimumSize(new java.awt.Dimension(30, 30));
        lb144.setName("0"); // NOI18N
        lb144.setOpaque(true);
        lb144.setPreferredSize(new java.awt.Dimension(30, 30));

        lb145.setBackground(new java.awt.Color(255, 255, 255));
        lb145.setToolTipText("");
        lb145.setMaximumSize(new java.awt.Dimension(30, 30));
        lb145.setMinimumSize(new java.awt.Dimension(30, 30));
        lb145.setName("0"); // NOI18N
        lb145.setOpaque(true);
        lb145.setPreferredSize(new java.awt.Dimension(30, 30));

        lb146.setBackground(new java.awt.Color(255, 255, 255));
        lb146.setToolTipText("");
        lb146.setMaximumSize(new java.awt.Dimension(30, 30));
        lb146.setMinimumSize(new java.awt.Dimension(30, 30));
        lb146.setName("0"); // NOI18N
        lb146.setOpaque(true);
        lb146.setPreferredSize(new java.awt.Dimension(30, 30));

        lb147.setBackground(new java.awt.Color(255, 255, 255));
        lb147.setToolTipText("");
        lb147.setMaximumSize(new java.awt.Dimension(30, 30));
        lb147.setMinimumSize(new java.awt.Dimension(30, 30));
        lb147.setName("0"); // NOI18N
        lb147.setOpaque(true);
        lb147.setPreferredSize(new java.awt.Dimension(30, 30));

        lb148.setBackground(new java.awt.Color(255, 255, 255));
        lb148.setToolTipText("");
        lb148.setMaximumSize(new java.awt.Dimension(30, 30));
        lb148.setMinimumSize(new java.awt.Dimension(30, 30));
        lb148.setName("0"); // NOI18N
        lb148.setOpaque(true);
        lb148.setPreferredSize(new java.awt.Dimension(30, 30));

        lb149.setBackground(new java.awt.Color(255, 255, 255));
        lb149.setToolTipText("");
        lb149.setMaximumSize(new java.awt.Dimension(30, 30));
        lb149.setMinimumSize(new java.awt.Dimension(30, 30));
        lb149.setName("0"); // NOI18N
        lb149.setOpaque(true);
        lb149.setPreferredSize(new java.awt.Dimension(30, 30));

        lb150.setBackground(new java.awt.Color(255, 255, 255));
        lb150.setToolTipText("");
        lb150.setMaximumSize(new java.awt.Dimension(30, 30));
        lb150.setMinimumSize(new java.awt.Dimension(30, 30));
        lb150.setName("0"); // NOI18N
        lb150.setOpaque(true);
        lb150.setPreferredSize(new java.awt.Dimension(30, 30));

        lb151.setBackground(new java.awt.Color(255, 255, 255));
        lb151.setToolTipText("");
        lb151.setMaximumSize(new java.awt.Dimension(30, 30));
        lb151.setMinimumSize(new java.awt.Dimension(30, 30));
        lb151.setName("0"); // NOI18N
        lb151.setOpaque(true);
        lb151.setPreferredSize(new java.awt.Dimension(30, 30));

        lb152.setBackground(new java.awt.Color(255, 255, 255));
        lb152.setToolTipText("");
        lb152.setMaximumSize(new java.awt.Dimension(30, 30));
        lb152.setMinimumSize(new java.awt.Dimension(30, 30));
        lb152.setName("0"); // NOI18N
        lb152.setOpaque(true);
        lb152.setPreferredSize(new java.awt.Dimension(30, 30));

        lb153.setBackground(new java.awt.Color(255, 255, 255));
        lb153.setToolTipText("");
        lb153.setMaximumSize(new java.awt.Dimension(30, 30));
        lb153.setMinimumSize(new java.awt.Dimension(30, 30));
        lb153.setName("0"); // NOI18N
        lb153.setOpaque(true);
        lb153.setPreferredSize(new java.awt.Dimension(30, 30));

        lb154.setBackground(new java.awt.Color(255, 255, 255));
        lb154.setToolTipText("");
        lb154.setMaximumSize(new java.awt.Dimension(30, 30));
        lb154.setMinimumSize(new java.awt.Dimension(30, 30));
        lb154.setName("0"); // NOI18N
        lb154.setOpaque(true);
        lb154.setPreferredSize(new java.awt.Dimension(30, 30));

        lb155.setBackground(new java.awt.Color(255, 255, 255));
        lb155.setToolTipText("");
        lb155.setMaximumSize(new java.awt.Dimension(30, 30));
        lb155.setMinimumSize(new java.awt.Dimension(30, 30));
        lb155.setName("0"); // NOI18N
        lb155.setOpaque(true);
        lb155.setPreferredSize(new java.awt.Dimension(30, 30));

        lb156.setBackground(new java.awt.Color(255, 255, 255));
        lb156.setToolTipText("");
        lb156.setMaximumSize(new java.awt.Dimension(30, 30));
        lb156.setMinimumSize(new java.awt.Dimension(30, 30));
        lb156.setName("0"); // NOI18N
        lb156.setOpaque(true);
        lb156.setPreferredSize(new java.awt.Dimension(30, 30));

        lb157.setBackground(new java.awt.Color(255, 255, 255));
        lb157.setToolTipText("");
        lb157.setMaximumSize(new java.awt.Dimension(30, 30));
        lb157.setMinimumSize(new java.awt.Dimension(30, 30));
        lb157.setName("0"); // NOI18N
        lb157.setOpaque(true);
        lb157.setPreferredSize(new java.awt.Dimension(30, 30));

        lb158.setBackground(new java.awt.Color(255, 255, 255));
        lb158.setToolTipText("");
        lb158.setMaximumSize(new java.awt.Dimension(30, 30));
        lb158.setMinimumSize(new java.awt.Dimension(30, 30));
        lb158.setName("0"); // NOI18N
        lb158.setOpaque(true);
        lb158.setPreferredSize(new java.awt.Dimension(30, 30));

        lb159.setBackground(new java.awt.Color(255, 255, 255));
        lb159.setToolTipText("");
        lb159.setMaximumSize(new java.awt.Dimension(30, 30));
        lb159.setMinimumSize(new java.awt.Dimension(30, 30));
        lb159.setName("0"); // NOI18N
        lb159.setOpaque(true);
        lb159.setPreferredSize(new java.awt.Dimension(30, 30));

        lb160.setBackground(new java.awt.Color(255, 255, 255));
        lb160.setToolTipText("");
        lb160.setMaximumSize(new java.awt.Dimension(30, 30));
        lb160.setMinimumSize(new java.awt.Dimension(30, 30));
        lb160.setName("0"); // NOI18N
        lb160.setOpaque(true);
        lb160.setPreferredSize(new java.awt.Dimension(30, 30));

        lb161.setBackground(new java.awt.Color(255, 255, 255));
        lb161.setToolTipText("");
        lb161.setMaximumSize(new java.awt.Dimension(30, 30));
        lb161.setMinimumSize(new java.awt.Dimension(30, 30));
        lb161.setName("0"); // NOI18N
        lb161.setOpaque(true);
        lb161.setPreferredSize(new java.awt.Dimension(30, 30));

        lb162.setBackground(new java.awt.Color(255, 255, 255));
        lb162.setToolTipText("");
        lb162.setMaximumSize(new java.awt.Dimension(30, 30));
        lb162.setMinimumSize(new java.awt.Dimension(30, 30));
        lb162.setName("0"); // NOI18N
        lb162.setOpaque(true);
        lb162.setPreferredSize(new java.awt.Dimension(30, 30));

        lb163.setBackground(new java.awt.Color(255, 255, 255));
        lb163.setToolTipText("");
        lb163.setMaximumSize(new java.awt.Dimension(30, 30));
        lb163.setMinimumSize(new java.awt.Dimension(30, 30));
        lb163.setName("0"); // NOI18N
        lb163.setOpaque(true);
        lb163.setPreferredSize(new java.awt.Dimension(30, 30));

        lb164.setBackground(new java.awt.Color(255, 255, 255));
        lb164.setToolTipText("");
        lb164.setMaximumSize(new java.awt.Dimension(30, 30));
        lb164.setMinimumSize(new java.awt.Dimension(30, 30));
        lb164.setName("0"); // NOI18N
        lb164.setOpaque(true);
        lb164.setPreferredSize(new java.awt.Dimension(30, 30));

        lb165.setBackground(new java.awt.Color(255, 255, 255));
        lb165.setToolTipText("");
        lb165.setMaximumSize(new java.awt.Dimension(30, 30));
        lb165.setMinimumSize(new java.awt.Dimension(30, 30));
        lb165.setName("0"); // NOI18N
        lb165.setOpaque(true);
        lb165.setPreferredSize(new java.awt.Dimension(30, 30));

        lb166.setBackground(new java.awt.Color(255, 255, 255));
        lb166.setToolTipText("");
        lb166.setMaximumSize(new java.awt.Dimension(30, 30));
        lb166.setMinimumSize(new java.awt.Dimension(30, 30));
        lb166.setName("0"); // NOI18N
        lb166.setOpaque(true);
        lb166.setPreferredSize(new java.awt.Dimension(30, 30));

        lb167.setBackground(new java.awt.Color(255, 255, 255));
        lb167.setToolTipText("");
        lb167.setMaximumSize(new java.awt.Dimension(30, 30));
        lb167.setMinimumSize(new java.awt.Dimension(30, 30));
        lb167.setName("0"); // NOI18N
        lb167.setOpaque(true);
        lb167.setPreferredSize(new java.awt.Dimension(30, 30));

        lb168.setBackground(new java.awt.Color(255, 255, 255));
        lb168.setToolTipText("");
        lb168.setMaximumSize(new java.awt.Dimension(30, 30));
        lb168.setMinimumSize(new java.awt.Dimension(30, 30));
        lb168.setName("0"); // NOI18N
        lb168.setOpaque(true);
        lb168.setPreferredSize(new java.awt.Dimension(30, 30));

        lb169.setBackground(new java.awt.Color(255, 255, 255));
        lb169.setToolTipText("");
        lb169.setMaximumSize(new java.awt.Dimension(30, 30));
        lb169.setMinimumSize(new java.awt.Dimension(30, 30));
        lb169.setName("0"); // NOI18N
        lb169.setOpaque(true);
        lb169.setPreferredSize(new java.awt.Dimension(30, 30));

        lb170.setBackground(new java.awt.Color(255, 255, 255));
        lb170.setToolTipText("");
        lb170.setMaximumSize(new java.awt.Dimension(30, 30));
        lb170.setMinimumSize(new java.awt.Dimension(30, 30));
        lb170.setName("0"); // NOI18N
        lb170.setOpaque(true);
        lb170.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lb136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lb141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lb146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lb151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb152, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lb156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb158, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb160, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lb161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb163, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb165, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lb166, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb167, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb170, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb152, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb158, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb160, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb163, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb165, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb167, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb170, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb166, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb171.setBackground(new java.awt.Color(255, 255, 255));
        lb171.setToolTipText("");
        lb171.setMaximumSize(new java.awt.Dimension(30, 30));
        lb171.setMinimumSize(new java.awt.Dimension(30, 30));
        lb171.setName("0"); // NOI18N
        lb171.setOpaque(true);
        lb171.setPreferredSize(new java.awt.Dimension(30, 30));

        lb172.setBackground(new java.awt.Color(255, 255, 255));
        lb172.setToolTipText("");
        lb172.setMaximumSize(new java.awt.Dimension(30, 30));
        lb172.setMinimumSize(new java.awt.Dimension(30, 30));
        lb172.setName("0"); // NOI18N
        lb172.setOpaque(true);
        lb172.setPreferredSize(new java.awt.Dimension(30, 30));

        lb173.setBackground(new java.awt.Color(255, 255, 255));
        lb173.setToolTipText("");
        lb173.setMaximumSize(new java.awt.Dimension(30, 30));
        lb173.setMinimumSize(new java.awt.Dimension(30, 30));
        lb173.setName("0"); // NOI18N
        lb173.setOpaque(true);
        lb173.setPreferredSize(new java.awt.Dimension(30, 30));

        lb174.setBackground(new java.awt.Color(255, 255, 255));
        lb174.setToolTipText("");
        lb174.setMaximumSize(new java.awt.Dimension(30, 30));
        lb174.setMinimumSize(new java.awt.Dimension(30, 30));
        lb174.setName("0"); // NOI18N
        lb174.setOpaque(true);
        lb174.setPreferredSize(new java.awt.Dimension(30, 30));

        lb175.setBackground(new java.awt.Color(255, 255, 255));
        lb175.setToolTipText("");
        lb175.setMaximumSize(new java.awt.Dimension(30, 30));
        lb175.setMinimumSize(new java.awt.Dimension(30, 30));
        lb175.setName("0"); // NOI18N
        lb175.setOpaque(true);
        lb175.setPreferredSize(new java.awt.Dimension(30, 30));

        lb176.setBackground(new java.awt.Color(255, 255, 255));
        lb176.setToolTipText("");
        lb176.setMaximumSize(new java.awt.Dimension(30, 30));
        lb176.setMinimumSize(new java.awt.Dimension(30, 30));
        lb176.setName("0"); // NOI18N
        lb176.setOpaque(true);
        lb176.setPreferredSize(new java.awt.Dimension(30, 30));

        lb177.setBackground(new java.awt.Color(255, 255, 255));
        lb177.setToolTipText("");
        lb177.setMaximumSize(new java.awt.Dimension(30, 30));
        lb177.setMinimumSize(new java.awt.Dimension(30, 30));
        lb177.setName("0"); // NOI18N
        lb177.setOpaque(true);
        lb177.setPreferredSize(new java.awt.Dimension(30, 30));

        lb178.setBackground(new java.awt.Color(255, 255, 255));
        lb178.setToolTipText("");
        lb178.setMaximumSize(new java.awt.Dimension(30, 30));
        lb178.setMinimumSize(new java.awt.Dimension(30, 30));
        lb178.setName("0"); // NOI18N
        lb178.setOpaque(true);
        lb178.setPreferredSize(new java.awt.Dimension(30, 30));

        lb179.setBackground(new java.awt.Color(255, 255, 255));
        lb179.setToolTipText("");
        lb179.setMaximumSize(new java.awt.Dimension(30, 30));
        lb179.setMinimumSize(new java.awt.Dimension(30, 30));
        lb179.setName("0"); // NOI18N
        lb179.setOpaque(true);
        lb179.setPreferredSize(new java.awt.Dimension(30, 30));

        lb180.setBackground(new java.awt.Color(255, 255, 255));
        lb180.setToolTipText("");
        lb180.setMaximumSize(new java.awt.Dimension(30, 30));
        lb180.setMinimumSize(new java.awt.Dimension(30, 30));
        lb180.setName("0"); // NOI18N
        lb180.setOpaque(true);
        lb180.setPreferredSize(new java.awt.Dimension(30, 30));

        lb181.setBackground(new java.awt.Color(255, 255, 255));
        lb181.setToolTipText("");
        lb181.setMaximumSize(new java.awt.Dimension(30, 30));
        lb181.setMinimumSize(new java.awt.Dimension(30, 30));
        lb181.setName("0"); // NOI18N
        lb181.setOpaque(true);
        lb181.setPreferredSize(new java.awt.Dimension(30, 30));

        lb182.setBackground(new java.awt.Color(255, 255, 255));
        lb182.setToolTipText("");
        lb182.setMaximumSize(new java.awt.Dimension(30, 30));
        lb182.setMinimumSize(new java.awt.Dimension(30, 30));
        lb182.setName("0"); // NOI18N
        lb182.setOpaque(true);
        lb182.setPreferredSize(new java.awt.Dimension(30, 30));

        lb183.setBackground(new java.awt.Color(255, 255, 255));
        lb183.setToolTipText("");
        lb183.setMaximumSize(new java.awt.Dimension(30, 30));
        lb183.setMinimumSize(new java.awt.Dimension(30, 30));
        lb183.setName("0"); // NOI18N
        lb183.setOpaque(true);
        lb183.setPreferredSize(new java.awt.Dimension(30, 30));

        lb184.setBackground(new java.awt.Color(255, 255, 255));
        lb184.setToolTipText("");
        lb184.setMaximumSize(new java.awt.Dimension(30, 30));
        lb184.setMinimumSize(new java.awt.Dimension(30, 30));
        lb184.setName("0"); // NOI18N
        lb184.setOpaque(true);
        lb184.setPreferredSize(new java.awt.Dimension(30, 30));

        lb185.setBackground(new java.awt.Color(255, 255, 255));
        lb185.setToolTipText("");
        lb185.setMaximumSize(new java.awt.Dimension(30, 30));
        lb185.setMinimumSize(new java.awt.Dimension(30, 30));
        lb185.setName("0"); // NOI18N
        lb185.setOpaque(true);
        lb185.setPreferredSize(new java.awt.Dimension(30, 30));

        lb186.setBackground(new java.awt.Color(255, 255, 255));
        lb186.setToolTipText("");
        lb186.setMaximumSize(new java.awt.Dimension(30, 30));
        lb186.setMinimumSize(new java.awt.Dimension(30, 30));
        lb186.setName("0"); // NOI18N
        lb186.setOpaque(true);
        lb186.setPreferredSize(new java.awt.Dimension(30, 30));

        lb187.setBackground(new java.awt.Color(255, 255, 255));
        lb187.setToolTipText("");
        lb187.setMaximumSize(new java.awt.Dimension(30, 30));
        lb187.setMinimumSize(new java.awt.Dimension(30, 30));
        lb187.setName("0"); // NOI18N
        lb187.setOpaque(true);
        lb187.setPreferredSize(new java.awt.Dimension(30, 30));

        lb188.setBackground(new java.awt.Color(255, 255, 255));
        lb188.setToolTipText("");
        lb188.setMaximumSize(new java.awt.Dimension(30, 30));
        lb188.setMinimumSize(new java.awt.Dimension(30, 30));
        lb188.setName("0"); // NOI18N
        lb188.setOpaque(true);
        lb188.setPreferredSize(new java.awt.Dimension(30, 30));

        lb189.setBackground(new java.awt.Color(255, 255, 255));
        lb189.setToolTipText("");
        lb189.setMaximumSize(new java.awt.Dimension(30, 30));
        lb189.setMinimumSize(new java.awt.Dimension(30, 30));
        lb189.setName("0"); // NOI18N
        lb189.setOpaque(true);
        lb189.setPreferredSize(new java.awt.Dimension(30, 30));

        lb190.setBackground(new java.awt.Color(255, 255, 255));
        lb190.setToolTipText("");
        lb190.setMaximumSize(new java.awt.Dimension(30, 30));
        lb190.setMinimumSize(new java.awt.Dimension(30, 30));
        lb190.setName("0"); // NOI18N
        lb190.setOpaque(true);
        lb190.setPreferredSize(new java.awt.Dimension(30, 30));

        lb191.setBackground(new java.awt.Color(255, 255, 255));
        lb191.setToolTipText("");
        lb191.setMaximumSize(new java.awt.Dimension(30, 30));
        lb191.setMinimumSize(new java.awt.Dimension(30, 30));
        lb191.setName("0"); // NOI18N
        lb191.setOpaque(true);
        lb191.setPreferredSize(new java.awt.Dimension(30, 30));

        lb192.setBackground(new java.awt.Color(255, 255, 255));
        lb192.setToolTipText("");
        lb192.setMaximumSize(new java.awt.Dimension(30, 30));
        lb192.setMinimumSize(new java.awt.Dimension(30, 30));
        lb192.setName("0"); // NOI18N
        lb192.setOpaque(true);
        lb192.setPreferredSize(new java.awt.Dimension(30, 30));

        lb193.setBackground(new java.awt.Color(255, 255, 255));
        lb193.setToolTipText("");
        lb193.setMaximumSize(new java.awt.Dimension(30, 30));
        lb193.setMinimumSize(new java.awt.Dimension(30, 30));
        lb193.setName("0"); // NOI18N
        lb193.setOpaque(true);
        lb193.setPreferredSize(new java.awt.Dimension(30, 30));

        lb194.setBackground(new java.awt.Color(255, 255, 255));
        lb194.setToolTipText("");
        lb194.setMaximumSize(new java.awt.Dimension(30, 30));
        lb194.setMinimumSize(new java.awt.Dimension(30, 30));
        lb194.setName("0"); // NOI18N
        lb194.setOpaque(true);
        lb194.setPreferredSize(new java.awt.Dimension(30, 30));

        lb195.setBackground(new java.awt.Color(255, 255, 255));
        lb195.setToolTipText("");
        lb195.setMaximumSize(new java.awt.Dimension(30, 30));
        lb195.setMinimumSize(new java.awt.Dimension(30, 30));
        lb195.setName("0"); // NOI18N
        lb195.setOpaque(true);
        lb195.setPreferredSize(new java.awt.Dimension(30, 30));

        lb196.setBackground(new java.awt.Color(255, 255, 255));
        lb196.setToolTipText("");
        lb196.setMaximumSize(new java.awt.Dimension(30, 30));
        lb196.setMinimumSize(new java.awt.Dimension(30, 30));
        lb196.setName("0"); // NOI18N
        lb196.setOpaque(true);
        lb196.setPreferredSize(new java.awt.Dimension(30, 30));

        lb197.setBackground(new java.awt.Color(255, 255, 255));
        lb197.setToolTipText("");
        lb197.setMaximumSize(new java.awt.Dimension(30, 30));
        lb197.setMinimumSize(new java.awt.Dimension(30, 30));
        lb197.setName("0"); // NOI18N
        lb197.setOpaque(true);
        lb197.setPreferredSize(new java.awt.Dimension(30, 30));

        lb198.setBackground(new java.awt.Color(255, 255, 255));
        lb198.setToolTipText("");
        lb198.setMaximumSize(new java.awt.Dimension(30, 30));
        lb198.setMinimumSize(new java.awt.Dimension(30, 30));
        lb198.setName("0"); // NOI18N
        lb198.setOpaque(true);
        lb198.setPreferredSize(new java.awt.Dimension(30, 30));

        lb199.setBackground(new java.awt.Color(255, 255, 255));
        lb199.setToolTipText("");
        lb199.setMaximumSize(new java.awt.Dimension(30, 30));
        lb199.setMinimumSize(new java.awt.Dimension(30, 30));
        lb199.setName("0"); // NOI18N
        lb199.setOpaque(true);
        lb199.setPreferredSize(new java.awt.Dimension(30, 30));

        lb200.setBackground(new java.awt.Color(255, 255, 255));
        lb200.setToolTipText("");
        lb200.setMaximumSize(new java.awt.Dimension(30, 30));
        lb200.setMinimumSize(new java.awt.Dimension(30, 30));
        lb200.setName("0"); // NOI18N
        lb200.setOpaque(true);
        lb200.setPreferredSize(new java.awt.Dimension(30, 30));

        lb201.setBackground(new java.awt.Color(255, 255, 255));
        lb201.setToolTipText("");
        lb201.setMaximumSize(new java.awt.Dimension(30, 30));
        lb201.setMinimumSize(new java.awt.Dimension(30, 30));
        lb201.setName("0"); // NOI18N
        lb201.setOpaque(true);
        lb201.setPreferredSize(new java.awt.Dimension(30, 30));

        lb202.setBackground(new java.awt.Color(255, 255, 255));
        lb202.setToolTipText("");
        lb202.setMaximumSize(new java.awt.Dimension(30, 30));
        lb202.setMinimumSize(new java.awt.Dimension(30, 30));
        lb202.setName("0"); // NOI18N
        lb202.setOpaque(true);
        lb202.setPreferredSize(new java.awt.Dimension(30, 30));

        lb203.setBackground(new java.awt.Color(255, 255, 255));
        lb203.setToolTipText("");
        lb203.setMaximumSize(new java.awt.Dimension(30, 30));
        lb203.setMinimumSize(new java.awt.Dimension(30, 30));
        lb203.setName("0"); // NOI18N
        lb203.setOpaque(true);
        lb203.setPreferredSize(new java.awt.Dimension(30, 30));

        lb204.setBackground(new java.awt.Color(255, 255, 255));
        lb204.setToolTipText("");
        lb204.setMaximumSize(new java.awt.Dimension(30, 30));
        lb204.setMinimumSize(new java.awt.Dimension(30, 30));
        lb204.setName("0"); // NOI18N
        lb204.setOpaque(true);
        lb204.setPreferredSize(new java.awt.Dimension(30, 30));

        lb205.setBackground(new java.awt.Color(255, 255, 255));
        lb205.setToolTipText("");
        lb205.setMaximumSize(new java.awt.Dimension(30, 30));
        lb205.setMinimumSize(new java.awt.Dimension(30, 30));
        lb205.setName("0"); // NOI18N
        lb205.setOpaque(true);
        lb205.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lb171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lb176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb179, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lb181, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lb186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb187, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb188, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb189, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb190, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lb191, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb193, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb194, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb195, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lb196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb199, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lb201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb179, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb181, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb187, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb188, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb189, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb190, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb193, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb194, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb195, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb191, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb199, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbplaca.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        lbplaca.setText("*** - ***");

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setText("LA PLACA ES: ");

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 13)); // NOI18N
        jLabel2.setText("dESARROLLADOR: JEAN PURIZACA ROQUE");

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel3.setText("RECONOCIMIENTO DE PLACAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnalizar)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        
        //matriz 1
        int[][] matriz = new int[7][5];
        int i = 0, j = 0;
        for (Component cmp : jPanel1.getComponents()) {  
            JLabel lb = (JLabel)cmp;
            matriz[i][j] = Integer.parseInt(lb.getName());                        
            j++;
            if(j == 5){
                i++;
                j = 0;
            }     
        }
        //matriz 2
        int[][] matriza = new int[7][5];
        int ia = 0, ja = 0;
        for (Component cmp : jPanel2.getComponents()) {  
            JLabel lba = (JLabel)cmp;
            matriza[ia][ja] = Integer.parseInt(lba.getName());                        
            ja++;
            if(ja == 5){
                ia++;
                ja = 0;
            }     
        }
        
        //matriz 3
        int[][] matrizb = new int[7][5];
        int ib = 0, jb = 0;
        for (Component cmp : jPanel3.getComponents()) {  
            JLabel lbb = (JLabel)cmp;
            matrizb[ib][jb] = Integer.parseInt(lbb.getName());                        
            jb++;
            if(jb == 5){
                ib++;
                jb = 0;
            }     
        }
        
        //matriz 4
        int[][] matrizc = new int[7][5];
        int ic = 0, jc = 0;
        for (Component cmp : jPanel4.getComponents()) {  
            JLabel lbc = (JLabel)cmp;
            matrizc[ic][jc] = Integer.parseInt(lbc.getName());                        
            jc++;
            if(jc == 5){
                ic++;
                jc = 0;
            }     
        }
        
        int[][] matrizd = new int[7][5];
        int id = 0, jd = 0;
        for (Component cmp : jPanel5.getComponents()) {  
            JLabel lbd = (JLabel)cmp;
            matrizd[id][jd] = Integer.parseInt(lbd.getName());                        
            jd++;
            if(jd == 5){
                id++;
                jd = 0;
            }     
        }
        
        
        int[][] matrize = new int[7][5];
        int ie = 0, je = 0;
        for (Component cmp : jPanel6.getComponents()) {  
            JLabel lbe = (JLabel)cmp;
            matrize[ie][je] = Integer.parseInt(lbe.getName());                        
            je++;
            if(je == 5){
                ie++;
                je = 0;
            }     
        }
        Vocales vol = new Vocales();
        
        vol.analizar(matriz);
        vol.getPlaca();
        vol.analizar(matriza);
        vol.getPlaca();
        vol.analizar(matrizb);
        vol.getPlaca(); 
        vol.analizar(matrizc);
        vol.getPlaca();
        vol.analizar(matrizd);
        vol.getPlaca();
        vol.analizar(matrize);
        lbplaca.setText(vol.getPlaca());
        
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        for (Component cmp : jPanel1.getComponents()) {
            cmp.setName("0");
            cmp.setBackground(Color.white);
            
        }
        
        for (Component cmp : jPanel2.getComponents()) {
            cmp.setName("0");
            cmp.setBackground(Color.white);
            
        }
        
        for (Component cmp : jPanel3.getComponents()) {
            cmp.setName("0");
            cmp.setBackground(Color.white);
            
        }
        
        for (Component cmp : jPanel4.getComponents()) {
            cmp.setName("0");
            cmp.setBackground(Color.white);
            
        }
        
        for (Component cmp : jPanel5.getComponents()) {
            cmp.setName("0");
            cmp.setBackground(Color.white);
            
        }
        
        for (Component cmp : jPanel6.getComponents()) {
            cmp.setName("0");
            cmp.setBackground(Color.white);
            
        }
        
        lbplaca.setText("*** - ***");
        
    }//GEN-LAST:event_btnCleanActionPerformed

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel l = (JLabel)e.getSource();
        if(l.getName().equals("0")){
            l.setBackground(new Color(102,102,102));
            l.setName("1");
        }else{
            l.setBackground(Color.white);
            l.setName("0");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVocal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnClean;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lb00;
    private javax.swing.JLabel lb01;
    private javax.swing.JLabel lb02;
    private javax.swing.JLabel lb03;
    private javax.swing.JLabel lb04;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb100;
    private javax.swing.JLabel lb101;
    private javax.swing.JLabel lb102;
    private javax.swing.JLabel lb103;
    private javax.swing.JLabel lb104;
    private javax.swing.JLabel lb105;
    private javax.swing.JLabel lb106;
    private javax.swing.JLabel lb107;
    private javax.swing.JLabel lb108;
    private javax.swing.JLabel lb109;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb110;
    private javax.swing.JLabel lb111;
    private javax.swing.JLabel lb112;
    private javax.swing.JLabel lb113;
    private javax.swing.JLabel lb114;
    private javax.swing.JLabel lb115;
    private javax.swing.JLabel lb116;
    private javax.swing.JLabel lb117;
    private javax.swing.JLabel lb118;
    private javax.swing.JLabel lb119;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb120;
    private javax.swing.JLabel lb121;
    private javax.swing.JLabel lb122;
    private javax.swing.JLabel lb123;
    private javax.swing.JLabel lb124;
    private javax.swing.JLabel lb125;
    private javax.swing.JLabel lb126;
    private javax.swing.JLabel lb127;
    private javax.swing.JLabel lb128;
    private javax.swing.JLabel lb129;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb130;
    private javax.swing.JLabel lb131;
    private javax.swing.JLabel lb132;
    private javax.swing.JLabel lb133;
    private javax.swing.JLabel lb134;
    private javax.swing.JLabel lb135;
    private javax.swing.JLabel lb136;
    private javax.swing.JLabel lb137;
    private javax.swing.JLabel lb138;
    private javax.swing.JLabel lb139;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb140;
    private javax.swing.JLabel lb141;
    private javax.swing.JLabel lb142;
    private javax.swing.JLabel lb143;
    private javax.swing.JLabel lb144;
    private javax.swing.JLabel lb145;
    private javax.swing.JLabel lb146;
    private javax.swing.JLabel lb147;
    private javax.swing.JLabel lb148;
    private javax.swing.JLabel lb149;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb150;
    private javax.swing.JLabel lb151;
    private javax.swing.JLabel lb152;
    private javax.swing.JLabel lb153;
    private javax.swing.JLabel lb154;
    private javax.swing.JLabel lb155;
    private javax.swing.JLabel lb156;
    private javax.swing.JLabel lb157;
    private javax.swing.JLabel lb158;
    private javax.swing.JLabel lb159;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lb160;
    private javax.swing.JLabel lb161;
    private javax.swing.JLabel lb162;
    private javax.swing.JLabel lb163;
    private javax.swing.JLabel lb164;
    private javax.swing.JLabel lb165;
    private javax.swing.JLabel lb166;
    private javax.swing.JLabel lb167;
    private javax.swing.JLabel lb168;
    private javax.swing.JLabel lb169;
    private javax.swing.JLabel lb17;
    private javax.swing.JLabel lb170;
    private javax.swing.JLabel lb171;
    private javax.swing.JLabel lb172;
    private javax.swing.JLabel lb173;
    private javax.swing.JLabel lb174;
    private javax.swing.JLabel lb175;
    private javax.swing.JLabel lb176;
    private javax.swing.JLabel lb177;
    private javax.swing.JLabel lb178;
    private javax.swing.JLabel lb179;
    private javax.swing.JLabel lb18;
    private javax.swing.JLabel lb180;
    private javax.swing.JLabel lb181;
    private javax.swing.JLabel lb182;
    private javax.swing.JLabel lb183;
    private javax.swing.JLabel lb184;
    private javax.swing.JLabel lb185;
    private javax.swing.JLabel lb186;
    private javax.swing.JLabel lb187;
    private javax.swing.JLabel lb188;
    private javax.swing.JLabel lb189;
    private javax.swing.JLabel lb19;
    private javax.swing.JLabel lb190;
    private javax.swing.JLabel lb191;
    private javax.swing.JLabel lb192;
    private javax.swing.JLabel lb193;
    private javax.swing.JLabel lb194;
    private javax.swing.JLabel lb195;
    private javax.swing.JLabel lb196;
    private javax.swing.JLabel lb197;
    private javax.swing.JLabel lb198;
    private javax.swing.JLabel lb199;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb20;
    private javax.swing.JLabel lb200;
    private javax.swing.JLabel lb201;
    private javax.swing.JLabel lb202;
    private javax.swing.JLabel lb203;
    private javax.swing.JLabel lb204;
    private javax.swing.JLabel lb205;
    private javax.swing.JLabel lb21;
    private javax.swing.JLabel lb22;
    private javax.swing.JLabel lb23;
    private javax.swing.JLabel lb24;
    private javax.swing.JLabel lb25;
    private javax.swing.JLabel lb26;
    private javax.swing.JLabel lb27;
    private javax.swing.JLabel lb28;
    private javax.swing.JLabel lb29;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb30;
    private javax.swing.JLabel lb31;
    private javax.swing.JLabel lb32;
    private javax.swing.JLabel lb33;
    private javax.swing.JLabel lb34;
    private javax.swing.JLabel lb35;
    private javax.swing.JLabel lb36;
    private javax.swing.JLabel lb37;
    private javax.swing.JLabel lb38;
    private javax.swing.JLabel lb39;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb40;
    private javax.swing.JLabel lb41;
    private javax.swing.JLabel lb42;
    private javax.swing.JLabel lb43;
    private javax.swing.JLabel lb44;
    private javax.swing.JLabel lb45;
    private javax.swing.JLabel lb46;
    private javax.swing.JLabel lb47;
    private javax.swing.JLabel lb48;
    private javax.swing.JLabel lb49;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb50;
    private javax.swing.JLabel lb51;
    private javax.swing.JLabel lb52;
    private javax.swing.JLabel lb53;
    private javax.swing.JLabel lb54;
    private javax.swing.JLabel lb55;
    private javax.swing.JLabel lb56;
    private javax.swing.JLabel lb57;
    private javax.swing.JLabel lb58;
    private javax.swing.JLabel lb59;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb60;
    private javax.swing.JLabel lb61;
    private javax.swing.JLabel lb62;
    private javax.swing.JLabel lb63;
    private javax.swing.JLabel lb64;
    private javax.swing.JLabel lb65;
    private javax.swing.JLabel lb66;
    private javax.swing.JLabel lb67;
    private javax.swing.JLabel lb68;
    private javax.swing.JLabel lb69;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb70;
    private javax.swing.JLabel lb71;
    private javax.swing.JLabel lb72;
    private javax.swing.JLabel lb73;
    private javax.swing.JLabel lb74;
    private javax.swing.JLabel lb75;
    private javax.swing.JLabel lb76;
    private javax.swing.JLabel lb77;
    private javax.swing.JLabel lb78;
    private javax.swing.JLabel lb79;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb80;
    private javax.swing.JLabel lb81;
    private javax.swing.JLabel lb82;
    private javax.swing.JLabel lb83;
    private javax.swing.JLabel lb84;
    private javax.swing.JLabel lb85;
    private javax.swing.JLabel lb86;
    private javax.swing.JLabel lb87;
    private javax.swing.JLabel lb88;
    private javax.swing.JLabel lb89;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lb90;
    private javax.swing.JLabel lb91;
    private javax.swing.JLabel lb92;
    private javax.swing.JLabel lb93;
    private javax.swing.JLabel lb94;
    private javax.swing.JLabel lb95;
    private javax.swing.JLabel lb96;
    private javax.swing.JLabel lb97;
    private javax.swing.JLabel lb98;
    private javax.swing.JLabel lb99;
    private javax.swing.JLabel lbplaca;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
