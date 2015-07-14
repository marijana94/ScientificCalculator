
public class ProgrammerMode extends javax.swing.JFrame {

    private boolean beginning_zero;
    private boolean having_decpoint;
    private boolean decimal_checked;
    private boolean binar_checked;
    private boolean octal_checked;
    private boolean hexadecimal_checked;

    private byte operator;

    private int number1;
    private int number2;
    private int result;
    private int base = 10;

    public ProgrammerMode() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        number_seven = new javax.swing.JButton();
        number_four = new javax.swing.JButton();
        number_one = new javax.swing.JButton();
        mr = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        add = new javax.swing.JButton();
        e = new javax.swing.JButton();
        substract = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        f = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        display1 = new javax.swing.JTextField();
        display2 = new javax.swing.JTextField();
        number_three = new javax.swing.JButton();
        memory_display = new javax.swing.JTextField();
        number_six = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        number_nine = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        number_zero = new javax.swing.JButton();
        number_two = new javax.swing.JButton();
        number_five = new javax.swing.JButton();
        number_eight = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        simple1 = new javax.swing.JLabel();
        simpleCalc = new javax.swing.JButton();
        d = new javax.swing.JButton();
        c = new javax.swing.JButton();
        b = new javax.swing.JButton();
        a = new javax.swing.JButton();
        dec = new javax.swing.JRadioButton();
        bin = new javax.swing.JRadioButton();
        oct = new javax.swing.JRadioButton();
        hex = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 509));

        reset.setBackground(new java.awt.Color(51, 51, 51));
        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(204, 204, 204));
        reset.setText("CE");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        number_seven.setBackground(new java.awt.Color(51, 51, 51));
        number_seven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_seven.setForeground(new java.awt.Color(204, 204, 204));
        number_seven.setText("7");
        number_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_sevenActionPerformed(evt);
            }
        });

        number_four.setBackground(new java.awt.Color(51, 51, 51));
        number_four.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_four.setForeground(new java.awt.Color(204, 204, 204));
        number_four.setText("4");
        number_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_fourActionPerformed(evt);
            }
        });

        number_one.setBackground(new java.awt.Color(51, 51, 51));
        number_one.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_one.setForeground(new java.awt.Color(204, 204, 204));
        number_one.setText("1");
        number_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_oneActionPerformed(evt);
            }
        });

        mr.setBackground(new java.awt.Color(51, 51, 51));
        mr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mr.setForeground(new java.awt.Color(204, 204, 204));
        mr.setText("MR");
        mr.setPreferredSize(new java.awt.Dimension(61, 40));
        mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrActionPerformed(evt);
            }
        });

        mc.setBackground(new java.awt.Color(51, 51, 51));
        mc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mc.setForeground(new java.awt.Color(204, 204, 204));
        mc.setText("MC");
        mc.setPreferredSize(new java.awt.Dimension(61, 40));
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });

        ms.setBackground(new java.awt.Color(51, 51, 51));
        ms.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ms.setForeground(new java.awt.Color(204, 204, 204));
        ms.setText("MS");
        ms.setPreferredSize(new java.awt.Dimension(61, 40));
        ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(204, 204, 204));
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        e.setBackground(new java.awt.Color(51, 51, 51));
        e.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        e.setForeground(new java.awt.Color(204, 204, 204));
        e.setText("E");
        e.setEnabled(false);
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        substract.setBackground(new java.awt.Color(51, 51, 51));
        substract.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        substract.setForeground(new java.awt.Color(204, 204, 204));
        substract.setText("-");
        substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(153, 0, 153));
        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(204, 204, 204));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        f.setBackground(new java.awt.Color(51, 51, 51));
        f.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        f.setForeground(new java.awt.Color(204, 204, 204));
        f.setText("F");
        f.setEnabled(false);
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(51, 51, 51));
        divide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divide.setForeground(new java.awt.Color(204, 204, 204));
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(51, 51, 51));
        multiply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        multiply.setForeground(new java.awt.Color(204, 204, 204));
        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        display1.setEditable(false);
        display1.setBackground(new java.awt.Color(102, 102, 102));
        display1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        display1.setForeground(new java.awt.Color(255, 255, 255));
        display1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display1.setText("0");
        display1.setAutoscrolls(false);
        display1.setBorder(null);
        display1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        display2.setEditable(false);
        display2.setBackground(new java.awt.Color(102, 102, 102));
        display2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        display2.setForeground(new java.awt.Color(255, 255, 255));
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2.setAutoscrolls(false);
        display2.setBorder(null);
        display2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        number_three.setBackground(new java.awt.Color(51, 51, 51));
        number_three.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_three.setForeground(new java.awt.Color(204, 204, 204));
        number_three.setText("3");
        number_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_threeActionPerformed(evt);
            }
        });

        memory_display.setEditable(false);
        memory_display.setBackground(new java.awt.Color(102, 102, 102));
        memory_display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memory_display.setForeground(new java.awt.Color(255, 255, 255));
        memory_display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        memory_display.setAutoscrolls(false);
        memory_display.setBorder(null);
        memory_display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        number_six.setBackground(new java.awt.Color(51, 51, 51));
        number_six.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_six.setForeground(new java.awt.Color(204, 204, 204));
        number_six.setText("6");
        number_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_sixActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Scientific");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        number_nine.setBackground(new java.awt.Color(51, 51, 51));
        number_nine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_nine.setForeground(new java.awt.Color(204, 204, 204));
        number_nine.setText("9");
        number_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_nineActionPerformed(evt);
            }
        });

        backspace.setBackground(new java.awt.Color(51, 51, 51));
        backspace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backspace.setForeground(new java.awt.Color(204, 204, 204));
        backspace.setText("<-");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        number_zero.setBackground(new java.awt.Color(51, 51, 51));
        number_zero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_zero.setForeground(new java.awt.Color(204, 204, 204));
        number_zero.setText("0");
        number_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_zeroActionPerformed(evt);
            }
        });

        number_two.setBackground(new java.awt.Color(51, 51, 51));
        number_two.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_two.setForeground(new java.awt.Color(204, 204, 204));
        number_two.setText("2");
        number_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_twoActionPerformed(evt);
            }
        });

        number_five.setBackground(new java.awt.Color(51, 51, 51));
        number_five.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_five.setForeground(new java.awt.Color(204, 204, 204));
        number_five.setText("5");
        number_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_fiveActionPerformed(evt);
            }
        });

        number_eight.setBackground(new java.awt.Color(51, 51, 51));
        number_eight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_eight.setForeground(new java.awt.Color(204, 204, 204));
        number_eight.setText("8");
        number_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_eightActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(51, 51, 51));
        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(204, 204, 204));
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        simple1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        simple1.setForeground(new java.awt.Color(204, 204, 204));
        simple1.setText("Programmer");
        simple1.setName("simple"); // NOI18N

        simpleCalc.setBackground(new java.awt.Color(51, 51, 51));
        simpleCalc.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        simpleCalc.setText("Simple");
        simpleCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleCalcActionPerformed(evt);
            }
        });

        d.setBackground(new java.awt.Color(51, 51, 51));
        d.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d.setForeground(new java.awt.Color(204, 204, 204));
        d.setText("D");
        d.setEnabled(false);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        c.setBackground(new java.awt.Color(51, 51, 51));
        c.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c.setForeground(new java.awt.Color(204, 204, 204));
        c.setText("C");
        c.setEnabled(false);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        b.setBackground(new java.awt.Color(51, 51, 51));
        b.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b.setForeground(new java.awt.Color(204, 204, 204));
        b.setText("B");
        b.setEnabled(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        a.setBackground(new java.awt.Color(51, 51, 51));
        a.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a.setForeground(new java.awt.Color(204, 204, 204));
        a.setText("A");
        a.setEnabled(false);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        dec.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(dec);
        dec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dec.setForeground(new java.awt.Color(204, 204, 204));
        dec.setSelected(true);
        dec.setText("Decimal");
        dec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decActionPerformed(evt);
            }
        });

        bin.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(bin);
        bin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bin.setForeground(new java.awt.Color(204, 204, 204));
        bin.setText("Binar");
        bin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binActionPerformed(evt);
            }
        });

        oct.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(oct);
        oct.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        oct.setForeground(new java.awt.Color(204, 204, 204));
        oct.setText("Octal");
        oct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octActionPerformed(evt);
            }
        });

        hex.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(hex);
        hex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hex.setForeground(new java.awt.Color(204, 204, 204));
        hex.setText("Hexadecimal");
        hex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(display2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                        .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(hex)
                                            .addComponent(oct, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bin, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dec, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(46, 46, 46))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(20, 20, 20)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(number_one, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                                .addComponent(number_four, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(number_seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(number_two, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                                .addComponent(number_eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(number_five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(number_zero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(number_three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(number_six, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(number_nine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(backspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(divide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(2, 2, 2)))
                                            .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(display1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(simpleCalc)
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(simple1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simple1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(simpleCalc))
                .addGap(5, 5, 5)
                .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oct))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(number_six, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(number_five, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(number_four, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number_three, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_two, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_one, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void printBinaryFormat(int number) {
        int binary[] = new int[25];
        int index = 0;
        while (number > 0) {
            binary[index++] = number % 2;
            number = number / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
            display1.setText(String.valueOf(binary[i]));
        }
    }

    public static int OctToDec(String oct) {
        int i = 0;
        for (int j = 0; j < oct.length(); j++) {
            char num = oct.charAt(j);
            num -= '0';
            if (num < 0 || num > 7) {
                System.out.print("invalid number");
                return -1;
            }
            i *= 8;
            i += num;
        }
        return i;
    }

    public static int DecToOct(int OctalNumber) {
        int counter = 0;
        int result = 0;
        while (OctalNumber != 0) {
            int temp = (int) ((OctalNumber % 8) * Math.pow(10, counter));
            counter++;
            result += temp;
            OctalNumber /= 8;
        }
        return result;
    }

    private int ToByte(String input) {
        int resultt = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            resultt += Math.pow(2, input.length() - i - 1) * (input.charAt(i) - '0');
        }
        return resultt;
    }

    private String toBinary(int number) {
        String invertResult = "", result = "";
        int temp = number;
        while (temp > 0) {
            invertResult += (temp % 2);
            temp /= 2;
        }
        for (int i = 0; i < invertResult.length(); i++) {
            result += invertResult.charAt(invertResult.length() - i - 1);
        }
        return result;
    }

    private int toInteger(String input) {
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            result += Math.pow(2, input.length() - i - 1) * (input.charAt(i) - '0');
        }
        return result;
    }
    
    public void write_number(String num){
        if(!beginning_zero && !having_decpoint) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + num);
        beginning_zero = true;        
    }

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        display1.setText("0");
        display2.setText(null);
        having_decpoint = false;
        beginning_zero = false;
        number1 = 0;
        number2 = 0;
        result = 0;
    }//GEN-LAST:event_resetActionPerformed

    private void number_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_sevenActionPerformed
        write_number("7");
    }//GEN-LAST:event_number_sevenActionPerformed

    private void number_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_fourActionPerformed
        write_number("4");
    }//GEN-LAST:event_number_fourActionPerformed

    private void number_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_oneActionPerformed
        write_number("1");
    }//GEN-LAST:event_number_oneActionPerformed

    private void mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrActionPerformed
        //display1.setText(String.valueOf(memory_display.getText()));
        CalcClass cc = new CalcClass();
        cc.mr(display1, memory_display);
    }//GEN-LAST:event_mrActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
        //memory_display.setText(null);
        CalcClass cc = new CalcClass();
        cc.mc(memory_display);
    }//GEN-LAST:event_mcActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
        //memory_display.setText(String.valueOf(display1.getText()));
        CalcClass cc = new CalcClass();
        cc.ms(display1, memory_display);
    }//GEN-LAST:event_msActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (operator == 0) {
            number1 = Integer.parseInt(String.valueOf(display1.getText()), base);
        } else {
            number2 = Integer.parseInt(String.valueOf(display1.getText()), base);
        }
        if (operator == 1) {
            number1 = number1 + number2;
        }
        if (operator == 2) {
            number1 = number1 - number2;
        }
        if (operator == 3) {
            number1 = number1 * number2;
        }
        if (operator == 4) {
            number1 = number1 / number2;
        }
        display2.setText(String.valueOf(number1) + " + ");
        operator = 1;
        having_decpoint = false;
        beginning_zero = false;
    }//GEN-LAST:event_addActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        if (!beginning_zero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "E");
        beginning_zero = true;
    }//GEN-LAST:event_eActionPerformed

    private void substractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractActionPerformed
        if (operator == 0) {
            number1 = Integer.parseInt(String.valueOf(display1.getText()), base);
        } else {
            number2 = Integer.parseInt(String.valueOf(display1.getText()), base);
        }
        if (operator == 1) {
            number1 = number1 + number2;
        }
        if (operator == 2) {
            number1 = number1 - number2;
        }
        if (operator == 3) {
            number1 = number1 * number2;
        }
        if (operator == 4) {
            number1 = number1 / number2;
        }

        display2.setText(String.valueOf(number1) + " - ");
        operator = 2;
        having_decpoint = false;
        beginning_zero = false;
    }//GEN-LAST:event_substractActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed

        number2 = Integer.parseInt(String.valueOf(display1.getText()), base);
        if (operator == 0) {
            result = number2;
            display2.setText(String.valueOf(number2));
        }
        if (operator == 1) {
            result = number1 + Integer.parseInt(display1.getText(), base);
            display2.setText(display2.getText() + String.valueOf(number2));
            display1.setText(String.valueOf(result));
        }
        if (operator == 2) {
            result = number1 - Integer.parseInt(display1.getText(), base);
            display2.setText(display2.getText() + String.valueOf(number2));
            display1.setText(String.valueOf(result));
        }
        if (operator == 3) {
            result = number1 * Integer.parseInt(display1.getText(), base);
            display2.setText(display2.getText() + String.valueOf(number2));
            display1.setText(String.valueOf(result));
        }
        if (operator == 4) {
            result = number1 / Integer.parseInt(display1.getText(), base);
            display2.setText(display2.getText() + String.valueOf(number2));
            display1.setText(String.valueOf(result));
        }
        if (result > -100000000 && result < 100000000) {
            display1.setText(Integer.toString(result, base));
        } else {
            display1.setText("Error");
        }

        number1 = 0;
        number2 = 0;
        result = 0;
        operator = 0;
        having_decpoint = false;
        beginning_zero = false;
    }//GEN-LAST:event_equalActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        if (!beginning_zero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "F");
        beginning_zero = true;
    }//GEN-LAST:event_fActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        if (operator == 0) {
            number1 = Integer.parseInt(String.valueOf(display1.getText()), base);
        } else {
            number2 = Integer.parseInt(String.valueOf(display1.getText()), base);
        }
        if (operator == 1) {
            number1 = number1 + number2;
        }
        if (operator == 2) {
            number1 = number1 - number2;
        }
        if (operator == 3) {
            number1 = number1 * number2;
        }
        if (operator == 4) {
            number1 = number1 / number2;
        }

        display2.setText(String.valueOf(number1) + " / ");
        operator = 4;
        having_decpoint = false;
        beginning_zero = false;
    }//GEN-LAST:event_divideActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        if (operator == 0) {
            number1 = Integer.parseInt(String.valueOf(display1.getText()), base);
        } else {
            number2 = Integer.parseInt(String.valueOf(display1.getText()), base);
        }
        if (operator == 1) {
            number1 = number1 + number2;
        }
        if (operator == 2) {
            number1 = number1 - number2;
        }
        if (operator == 3) {
            number1 = number1 * number2;
        }
        if (operator == 4) {
            number1 = number1 / number2;
        }

        display2.setText(String.valueOf(number1) + " * ");
        operator = 3;
        having_decpoint = false;
        beginning_zero = false;
    }//GEN-LAST:event_multiplyActionPerformed

    private void number_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_threeActionPerformed
        write_number("3");
    }//GEN-LAST:event_number_threeActionPerformed

    private void number_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_sixActionPerformed
        write_number("6");
    }//GEN-LAST:event_number_sixActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Calculator simpleCalculator = new Calculator();
        //simpleCalculator.setVisible(false);
        this.dispose();
        ScientificCalculator scientificCalc = new ScientificCalculator();
        scientificCalc.setVisible(true);
        scientificCalc.setLocation(295, 96);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void number_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_nineActionPerformed
        write_number("9");
    }//GEN-LAST:event_number_nineActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed

        if (display1.getText().length() > 0) {
            display1.setText(display1.getText().substring(0, display1.getText().length() - 1));
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void number_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_zeroActionPerformed
        if (!beginning_zero && !having_decpoint) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "0");
    }//GEN-LAST:event_number_zeroActionPerformed

    private void number_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_twoActionPerformed
        write_number("2");
    }//GEN-LAST:event_number_twoActionPerformed

    private void number_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_fiveActionPerformed
        write_number("5");
    }//GEN-LAST:event_number_fiveActionPerformed

    private void number_eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_eightActionPerformed
        write_number("8");
    }//GEN-LAST:event_number_eightActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display1.setText("0");
        display2.setText(null);
        having_decpoint = false;
        beginning_zero = false;
    }//GEN-LAST:event_clearActionPerformed

    private void simpleCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleCalcActionPerformed
        this.dispose();
        Calculator calc = new Calculator();
        calc.setVisible(true);
        calc.setLocation(300, 100);
    }//GEN-LAST:event_simpleCalcActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        if (!beginning_zero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "D");
        beginning_zero = true;
    }//GEN-LAST:event_dActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        if (!beginning_zero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "C");
        beginning_zero = true;
    }//GEN-LAST:event_cActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        if (!beginning_zero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "B");
        beginning_zero = true;
    }//GEN-LAST:event_bActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        if (!beginning_zero) {
            display1.setText(null);
        }
        display1.setText(display1.getText() + "A");
        beginning_zero = true;
    }//GEN-LAST:event_aActionPerformed

    private void decActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decActionPerformed
        decimal_checked = true;
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        number_eight.setEnabled(true);
        number_nine.setEnabled(true);
        number_two.setEnabled(true);
        number_three.setEnabled(true);
        number_four.setEnabled(true);
        number_five.setEnabled(true);
        number_six.setEnabled(true);
        number_seven.setEnabled(true);
        int number = Integer.parseInt(String.valueOf(display1.getText()), base);
        display1.setText(Integer.toString(number));
        display2.setText(null);
        display2.setText(null);
        base = 10;
    }//GEN-LAST:event_decActionPerformed

    private void binActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binActionPerformed
        binar_checked = true;
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        number_eight.setEnabled(false);
        number_nine.setEnabled(false);
        number_two.setEnabled(false);
        number_three.setEnabled(false);
        number_four.setEnabled(false);
        number_five.setEnabled(false);
        number_six.setEnabled(false);
        number_seven.setEnabled(false);
        //plus_minus.setEnabled(false);
        //display1.setText("0");
        int number = Integer.parseInt(String.valueOf(display1.getText()), base);
        display1.setText(Integer.toBinaryString(number));
        display2.setText(null);
        base = 2;
    }//GEN-LAST:event_binActionPerformed

    private void octActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octActionPerformed
        octal_checked = true;
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        number_eight.setEnabled(false);
        number_nine.setEnabled(false);
        number_two.setEnabled(true);
        number_three.setEnabled(true);
        number_four.setEnabled(true);
        number_five.setEnabled(true);
        number_six.setEnabled(true);
        number_seven.setEnabled(true);
        //plus_minus.setEnabled(false);
        int number = Integer.parseInt(String.valueOf(display1.getText()), base);
        display1.setText(Integer.toOctalString(number));
        display2.setText(null);
        display2.setText(null);
        base = 8;
    }//GEN-LAST:event_octActionPerformed

    private void hexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexActionPerformed
        hexadecimal_checked = true;
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        number_eight.setEnabled(true);
        number_nine.setEnabled(true);
        number_two.setEnabled(true);
        number_three.setEnabled(true);
        number_four.setEnabled(true);
        number_five.setEnabled(true);
        number_six.setEnabled(true);
        number_seven.setEnabled(true);
        //plus_minus.setEnabled(false);
        int number = Integer.parseInt(String.valueOf(display1.getText()), base);
        display1.setText(Integer.toHexString(number));
        display2.setText(null);
        display2.setText(null);
        base = 16;
    }//GEN-LAST:event_hexActionPerformed

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
            java.util.logging.Logger.getLogger(ProgrammerMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgrammerMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgrammerMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgrammerMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgrammerMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton add;
    private javax.swing.JButton b;
    private javax.swing.JButton backspace;
    private javax.swing.JRadioButton bin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton c;
    private javax.swing.JButton clear;
    private javax.swing.JButton d;
    private javax.swing.JRadioButton dec;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton e;
    private javax.swing.JButton equal;
    private javax.swing.JButton f;
    private javax.swing.JRadioButton hex;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mc;
    private javax.swing.JTextField memory_display;
    private javax.swing.JButton mr;
    private javax.swing.JButton ms;
    private javax.swing.JButton multiply;
    private javax.swing.JButton number_eight;
    private javax.swing.JButton number_five;
    private javax.swing.JButton number_four;
    private javax.swing.JButton number_nine;
    private javax.swing.JButton number_one;
    private javax.swing.JButton number_seven;
    private javax.swing.JButton number_six;
    private javax.swing.JButton number_three;
    private javax.swing.JButton number_two;
    private javax.swing.JButton number_zero;
    private javax.swing.JRadioButton oct;
    private javax.swing.JButton reset;
    private javax.swing.JLabel simple1;
    private javax.swing.JButton simpleCalc;
    private javax.swing.JButton substract;
    // End of variables declaration//GEN-END:variables
}
