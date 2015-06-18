
public class ScientificCalculator extends javax.swing.JFrame {

    private boolean beginning_zero;
    private boolean having_decpoint;
    private boolean radians_checked;
    
    private byte operator;
    
    private double number1;
    private double number2;
    private double result;
    
    public ScientificCalculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        number_one = new javax.swing.JButton();
        mr = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        one_divide_x = new javax.swing.JButton();
        plus_minus = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        simple = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        number_three = new javax.swing.JButton();
        display2 = new javax.swing.JTextField();
        number_six = new javax.swing.JButton();
        memory_display = new javax.swing.JTextField();
        number_nine = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        number_zero = new javax.swing.JButton();
        number_two = new javax.swing.JButton();
        number_five = new javax.swing.JButton();
        number_eight = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        add = new javax.swing.JButton();
        substract = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        decimal_point = new javax.swing.JButton();
        number_seven = new javax.swing.JButton();
        number_four = new javax.swing.JButton();
        sinus = new javax.swing.JButton();
        cosinus = new javax.swing.JButton();
        tanh = new javax.swing.JButton();
        tangens = new javax.swing.JButton();
        cosh = new javax.swing.JButton();
        sinh = new javax.swing.JButton();
        cuberoot = new javax.swing.JButton();
        cubed = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        degrees = new javax.swing.JRadioButton();
        radians = new javax.swing.JRadioButton();
        arctan = new javax.swing.JButton();
        arccos = new javax.swing.JButton();
        arcsin = new javax.swing.JButton();
        logarithm = new javax.swing.JButton();
        nlogarithm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("scientificCalc"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 509));

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
        mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrActionPerformed(evt);
            }
        });

        mc.setBackground(new java.awt.Color(51, 51, 51));
        mc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mc.setForeground(new java.awt.Color(204, 204, 204));
        mc.setText("MC");
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });

        ms.setBackground(new java.awt.Color(51, 51, 51));
        ms.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ms.setForeground(new java.awt.Color(204, 204, 204));
        ms.setText("MS");
        ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msActionPerformed(evt);
            }
        });

        one_divide_x.setBackground(new java.awt.Color(51, 51, 51));
        one_divide_x.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        one_divide_x.setForeground(new java.awt.Color(204, 204, 204));
        one_divide_x.setText("1⁄x");
        one_divide_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_divide_xActionPerformed(evt);
            }
        });

        plus_minus.setBackground(new java.awt.Color(51, 51, 51));
        plus_minus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plus_minus.setForeground(new java.awt.Color(204, 204, 204));
        plus_minus.setText("±");
        plus_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_minusActionPerformed(evt);
            }
        });

        sqrt.setBackground(new java.awt.Color(51, 51, 51));
        sqrt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sqrt.setForeground(new java.awt.Color(204, 204, 204));
        sqrt.setText("√");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        simple.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        simple.setForeground(new java.awt.Color(204, 204, 204));
        simple.setText("Scientific");
        simple.setName("simple"); // NOI18N

        display.setEditable(false);
        display.setBackground(new java.awt.Color(102, 102, 102));
        display.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.setAutoscrolls(false);
        display.setBorder(null);
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        number_three.setBackground(new java.awt.Color(51, 51, 51));
        number_three.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_three.setForeground(new java.awt.Color(204, 204, 204));
        number_three.setText("3");
        number_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_threeActionPerformed(evt);
            }
        });

        display2.setEditable(false);
        display2.setBackground(new java.awt.Color(102, 102, 102));
        display2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        display2.setForeground(new java.awt.Color(255, 255, 255));
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2.setAutoscrolls(false);
        display2.setBorder(null);
        display2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        display2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display2ActionPerformed(evt);
            }
        });

        number_six.setBackground(new java.awt.Color(51, 51, 51));
        number_six.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number_six.setForeground(new java.awt.Color(204, 204, 204));
        number_six.setText("6");
        number_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_sixActionPerformed(evt);
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
        memory_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memory_displayActionPerformed(evt);
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

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Simple");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        reset.setBackground(new java.awt.Color(51, 51, 51));
        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(204, 204, 204));
        reset.setText("CE");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
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

        substract.setBackground(new java.awt.Color(51, 51, 51));
        substract.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        substract.setForeground(new java.awt.Color(204, 204, 204));
        substract.setText("-");
        substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(0, 153, 204));
        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(204, 204, 204));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
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

        decimal_point.setBackground(new java.awt.Color(51, 51, 51));
        decimal_point.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        decimal_point.setForeground(new java.awt.Color(204, 204, 204));
        decimal_point.setText(",");
        decimal_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimal_pointActionPerformed(evt);
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

        sinus.setBackground(new java.awt.Color(51, 51, 51));
        sinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sinus.setForeground(new java.awt.Color(204, 204, 204));
        sinus.setText("sin");
        sinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusActionPerformed(evt);
            }
        });

        cosinus.setBackground(new java.awt.Color(51, 51, 51));
        cosinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cosinus.setForeground(new java.awt.Color(204, 204, 204));
        cosinus.setText("cos");
        cosinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinusActionPerformed(evt);
            }
        });

        tanh.setBackground(new java.awt.Color(51, 51, 51));
        tanh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tanh.setForeground(new java.awt.Color(204, 204, 204));
        tanh.setText("th");
        tanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanhActionPerformed(evt);
            }
        });

        tangens.setBackground(new java.awt.Color(51, 51, 51));
        tangens.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tangens.setForeground(new java.awt.Color(204, 204, 204));
        tangens.setText("tan");
        tangens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangensActionPerformed(evt);
            }
        });

        cosh.setBackground(new java.awt.Color(51, 51, 51));
        cosh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cosh.setForeground(new java.awt.Color(204, 204, 204));
        cosh.setText("ch");
        cosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coshActionPerformed(evt);
            }
        });

        sinh.setBackground(new java.awt.Color(51, 51, 51));
        sinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sinh.setForeground(new java.awt.Color(204, 204, 204));
        sinh.setText("sh");
        sinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinhActionPerformed(evt);
            }
        });

        cuberoot.setBackground(new java.awt.Color(51, 51, 51));
        cuberoot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cuberoot.setForeground(new java.awt.Color(204, 204, 204));
        cuberoot.setText("3√"); // NOI18N
        cuberoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuberootActionPerformed(evt);
            }
        });

        cubed.setBackground(new java.awt.Color(51, 51, 51));
        cubed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cubed.setForeground(new java.awt.Color(204, 204, 204));
        cubed.setText("x^3");
        cubed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubedActionPerformed(evt);
            }
        });

        squared.setBackground(new java.awt.Color(51, 51, 51));
        squared.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        squared.setForeground(new java.awt.Color(204, 204, 204));
        squared.setText("x^2");
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });

        pi.setBackground(new java.awt.Color(51, 51, 51));
        pi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pi.setForeground(new java.awt.Color(204, 204, 204));
        pi.setText("π");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        exp.setBackground(new java.awt.Color(51, 51, 51));
        exp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exp.setForeground(new java.awt.Color(204, 204, 204));
        exp.setText("e^x");
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        percent.setBackground(new java.awt.Color(51, 51, 51));
        percent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        percent.setForeground(new java.awt.Color(204, 204, 204));
        percent.setText("%");
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        degrees.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(degrees);
        degrees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        degrees.setForeground(new java.awt.Color(204, 204, 204));
        degrees.setSelected(true);
        degrees.setText("Degrees");
        degrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesActionPerformed(evt);
            }
        });

        radians.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(radians);
        radians.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radians.setForeground(new java.awt.Color(204, 204, 204));
        radians.setText("Radians");
        radians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansActionPerformed(evt);
            }
        });

        arctan.setBackground(new java.awt.Color(51, 51, 51));
        arctan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arctan.setForeground(new java.awt.Color(204, 204, 204));
        arctan.setText("atan");
        arctan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arctanActionPerformed(evt);
            }
        });

        arccos.setBackground(new java.awt.Color(51, 51, 51));
        arccos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arccos.setForeground(new java.awt.Color(204, 204, 204));
        arccos.setText("acos");
        arccos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arccosActionPerformed(evt);
            }
        });

        arcsin.setBackground(new java.awt.Color(51, 51, 51));
        arcsin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arcsin.setForeground(new java.awt.Color(204, 204, 204));
        arcsin.setText("asin");
        arcsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcsinActionPerformed(evt);
            }
        });

        logarithm.setBackground(new java.awt.Color(51, 51, 51));
        logarithm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logarithm.setForeground(new java.awt.Color(204, 204, 204));
        logarithm.setText("log");
        logarithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarithmActionPerformed(evt);
            }
        });

        nlogarithm.setBackground(new java.awt.Color(51, 51, 51));
        nlogarithm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nlogarithm.setForeground(new java.awt.Color(204, 204, 204));
        nlogarithm.setText("ln");
        nlogarithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nlogarithmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(simple, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(display2)
                            .addComponent(display, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(one_divide_x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(plus_minus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cuberoot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(sinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cosinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(5, 5, 5)
                                            .addComponent(tangens, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(radians, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(degrees, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(logarithm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nlogarithm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(arcsin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arccos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arctan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(number_seven, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                .addComponent(number_four, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                .addComponent(number_one, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                            .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(number_five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(number_eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(number_two, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(number_zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(number_nine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(number_three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(decimal_point, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number_six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                                .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simple, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(5, 5, 5)
                .addComponent(memory_display, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(degrees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nlogarithm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logarithm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radians))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_six, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_five, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_four, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_three, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_two, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_one, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cuberoot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tangens, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cosinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plus_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimal_point, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_divide_x, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arctan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arccos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arcsin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("scientificCalc");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_fourActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "4");
        beginning_zero = true;
    }//GEN-LAST:event_number_fourActionPerformed

    private void number_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_sevenActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "7");
        beginning_zero = true;
    }//GEN-LAST:event_number_sevenActionPerformed

    private void decimal_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimal_pointActionPerformed
        if(!having_decpoint) {
            display.setText(display.getText() + ".");
            having_decpoint = true;
        }
    }//GEN-LAST:event_decimal_pointActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        if(operator == 0) {
            number1 = Double.parseDouble(String.valueOf(display.getText()));
        }
        else {
            number2 = Double.parseDouble(String.valueOf(display.getText()));
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

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        if(operator == 0) {
            number1 = Double.parseDouble(String.valueOf(display.getText()));
        }
        else {
            number2 = Double.parseDouble(String.valueOf(display.getText()));
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

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        /* operator == 0 (nothing)
        operator == 1 (addition)
        operator  == 2 (substraction)
        operator == 3 (multiplication)
        operator == 4 (dividing)
        operator == 5 (percentage)*/
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        if (operator == 0) {
            result = number2;
            display2.setText(String.valueOf(number2));
        }

        if (operator == 1) {
            result = number1 + number2;
            display2.setText(display2.getText() + String.valueOf(number2));
            display.setText(String.valueOf(result));
        }

        if (operator == 2) {
            result = number1 - number2;
            display2.setText(display2.getText() + String.valueOf(number2));
            display.setText(String.valueOf(result));
        }

        if (operator == 3) {
            result = number1 * number2;
            display2.setText(display2.getText() + String.valueOf(number2));
            display.setText(String.valueOf(result));
        }

        if (operator == 4) {
            result = number1 / number2;
            display2.setText(display2.getText() + String.valueOf(number2));
            display.setText(String.valueOf(result));
        }
        
        if (operator == 5) {
            result = number1 * number2 / 100;
            display2.setText(display2.getText() + String.valueOf(number2) + ")");
        }

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("Error");
        }

        number1 = 0;
        number2 = 0;
        result = 0;
        operator = 0;
        having_decpoint = false;
        beginning_zero = false;
    }//GEN-LAST:event_equalActionPerformed

    private void substractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractActionPerformed
        if(operator == 0) {
            number1 = Double.parseDouble(String.valueOf(display.getText()));
        }
        else {
            number2 = Double.parseDouble(String.valueOf(display.getText()));
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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(operator == 0) {
            number1 = Double.parseDouble(String.valueOf(display.getText()));
        }
        else {
            number2 = Double.parseDouble(String.valueOf(display.getText()));
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

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        display.setText("0");
        display2.setText(null);
        having_decpoint = false;
        beginning_zero = false;
        number1 = 0;
        number2 = 0;
        result = 0;
    }//GEN-LAST:event_resetActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display.setText("0");
        display2.setText(null);
        having_decpoint = false;
        beginning_zero = false;
    }//GEN-LAST:event_clearActionPerformed

    private void number_eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_eightActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "8");
        beginning_zero = true;
    }//GEN-LAST:event_number_eightActionPerformed

    private void number_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_fiveActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "5");
        beginning_zero = true;
    }//GEN-LAST:event_number_fiveActionPerformed

    private void number_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_twoActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "2");
        beginning_zero = true;
    }//GEN-LAST:event_number_twoActionPerformed

    private void number_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_zeroActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "0");
    }//GEN-LAST:event_number_zeroActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        /*String s[] = new String[];
        String display_string = String.valueOf(display.getText());
        for (int i = 0; i < display_string.length() - 1 ; i++)
        s += display_string[i];*/
        /*double value = Double.parseDouble(String.valueOf(display.getText()));
        double value1 = (int)value/10 + value - (int)value;
        display.setText(String.valueOf(value1));*/
        if(display.getText().length() > 0){
            display.setText(display.getText().substring(0,display.getText().length() - 1));
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Calculator calc = new Calculator();
        calc.setVisible(true);
        calc.setLocation(295, 96);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void number_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_nineActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "9");
        beginning_zero = true;
    }//GEN-LAST:event_number_nineActionPerformed

    private void memory_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memory_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memory_displayActionPerformed

    private void number_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_sixActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "6");
        beginning_zero = true;
    }//GEN-LAST:event_number_sixActionPerformed

    private void display2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display2ActionPerformed

    private void number_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_threeActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "3");
        beginning_zero = true;
    }//GEN-LAST:event_number_threeActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = Math.sqrt(number2);

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("Error");
        }
        display2.setText("√" + String.valueOf(number2));
        result = 0;
    }//GEN-LAST:event_sqrtActionPerformed

    private void plus_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_minusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = number2 * (-1);

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("Error");
        }
        having_decpoint = true;
        result = 0;
    }//GEN-LAST:event_plus_minusActionPerformed

    private void one_divide_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_divide_xActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = 1/number2;

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("Error");
        }

        display2.setText("1/" + String.valueOf(number2));
        result = 0;
    }//GEN-LAST:event_one_divide_xActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
        memory_display.setText(String.valueOf(display.getText()));
    }//GEN-LAST:event_msActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
        memory_display.setText(null);
    }//GEN-LAST:event_mcActionPerformed

    private void mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrActionPerformed
        display.setText(String.valueOf(memory_display.getText()));
    }//GEN-LAST:event_mrActionPerformed

    private void number_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_oneActionPerformed
        if(!beginning_zero && !having_decpoint) {
            display.setText(null);
        }
        display.setText(display.getText() + "1");
        beginning_zero = true;
    }//GEN-LAST:event_number_oneActionPerformed

    private void sinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusActionPerformed
        //Java performs trigonometric functions in radians, so if degrees will be selected
        //it will be converted from degrees to radians
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("sin(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            number2 = number2 * 0.0174532925;
        }
        result = Math.sin(number2);
        display.setText(String.valueOf(result));
        result = 0;
    }//GEN-LAST:event_sinusActionPerformed

    private void cosinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinusActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("cos(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            number2 = number2 * 0.0174532925;
        }
        result = Math.cos(number2);
        display.setText(String.valueOf(result));
        result = 0;
    }//GEN-LAST:event_cosinusActionPerformed

    private void tanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanhActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("tanh(" + String.valueOf(number2) + ")");
        result = Math.tanh(number2);
        display.setText(String.valueOf(result));
        result = 0; 
    }//GEN-LAST:event_tanhActionPerformed

    private void tangensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangensActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("tan(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            number2 = number2 * 0.0174532925;
        }
        result = Math.tan(number2);
        display.setText(String.valueOf(result));
        result = 0;
    }//GEN-LAST:event_tangensActionPerformed

    private void coshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coshActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("cosh(" + String.valueOf(number2) + ")");
        result = Math.cosh(number2);
        display.setText(String.valueOf(result));
        result = 0; 
    }//GEN-LAST:event_coshActionPerformed

    private void sinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinhActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("sinh(" + String.valueOf(number2) + ")");
        result = Math.sinh(number2);
        display.setText(String.valueOf(result));
        result = 0;        
    }//GEN-LAST:event_sinhActionPerformed

    private void cuberootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuberootActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = Math.cbrt(number2);

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("Error");
        }
        display2.setText("3√" + String.valueOf(number2));
        result = 0;
    }//GEN-LAST:event_cuberootActionPerformed

    private void cubedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubedActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = number2 * number2 * number2;

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("Error");
        }
        display2.setText(String.valueOf(number2) + "^3");
        result = 0;
    }//GEN-LAST:event_cubedActionPerformed

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaredActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        result = number2 * number2;

        if (result > -100000000 && result < 100000000) {
            display.setText(String.valueOf(result));
        }
        else {
            display.setText("Error");
        }
        display2.setText(String.valueOf(number2) + "^2");
        result = 0;
    }//GEN-LAST:event_squaredActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        display.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_piActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("e^(" + String.valueOf(number2) + ")");
        result = Math.exp(number2);
        display.setText(String.valueOf(result));
        result = 0; 
    }//GEN-LAST:event_expActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        number1 = Double.parseDouble(String.valueOf(display.getText()));
        display.setText("0");
        display2.setText(String.valueOf(number1) + "%(");
        having_decpoint = false;
        beginning_zero = false;
        operator = 5;
    }//GEN-LAST:event_percentActionPerformed

    private void degreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesActionPerformed
        radians_checked = false;
    }//GEN-LAST:event_degreesActionPerformed

    private void radiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiansActionPerformed
        radians_checked = true;
    }//GEN-LAST:event_radiansActionPerformed

    private void arctanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arctanActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("arctan(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            result = Math.toDegrees(Math.atan(number2));
            display.setText(String.valueOf(result));
            result = 0;
        }
        else{
            result = Math.atan(number2);
            display.setText(String.valueOf(result));
            result = 0;
        }
    }//GEN-LAST:event_arctanActionPerformed

    private void arccosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arccosActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("arccos(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            result = Math.toDegrees(Math.acos(number2));
            display.setText(String.valueOf(result));
            result = 0;
        }
        else{
            result = Math.acos(number2);
            display.setText(String.valueOf(result));
            result = 0;
        }
    }//GEN-LAST:event_arccosActionPerformed

    private void arcsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcsinActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("arcsin(" + String.valueOf(number2) + ")");
        if (!radians_checked) {
            result = Math.toDegrees(Math.asin(number2));
            display.setText(String.valueOf(result));
            result = 0;
        }
        else{
            result = Math.asin(number2);
            display.setText(String.valueOf(result));
            result = 0;
        }
    }//GEN-LAST:event_arcsinActionPerformed

    private void logarithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarithmActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("log(" + String.valueOf(number2) + ")");
        result = Math.log10(number2);
        display.setText(String.valueOf(result));
        result = 0; 
    }//GEN-LAST:event_logarithmActionPerformed

    private void nlogarithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nlogarithmActionPerformed
        number2 = Double.parseDouble(String.valueOf(display.getText()));
        display2.setText("ln(" + String.valueOf(number2) + ")");
        result = Math.log(number2);
        display.setText(String.valueOf(result));
        result = 0; 
    }//GEN-LAST:event_nlogarithmActionPerformed

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
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton arccos;
    private javax.swing.JButton arcsin;
    private javax.swing.JButton arctan;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton cosh;
    private javax.swing.JButton cosinus;
    private javax.swing.JButton cubed;
    private javax.swing.JButton cuberoot;
    private javax.swing.JButton decimal_point;
    private javax.swing.JRadioButton degrees;
    private javax.swing.JTextField display;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JButton exp;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logarithm;
    private javax.swing.JButton mc;
    private javax.swing.JTextField memory_display;
    private javax.swing.JButton mr;
    private javax.swing.JButton ms;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nlogarithm;
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
    private javax.swing.JButton one_divide_x;
    private javax.swing.JButton percent;
    private javax.swing.JButton pi;
    private javax.swing.JButton plus_minus;
    private javax.swing.JRadioButton radians;
    private javax.swing.JButton reset;
    private javax.swing.JLabel simple;
    private javax.swing.JButton sinh;
    private javax.swing.JButton sinus;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton squared;
    private javax.swing.JButton substract;
    private javax.swing.JButton tangens;
    private javax.swing.JButton tanh;
    // End of variables declaration//GEN-END:variables
}
