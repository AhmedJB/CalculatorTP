package com.example.calculatortp.ui.Scientific;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.calculatortp.R;
import com.example.calculatortp.databinding.FragmentScientificBinding;

public class ScientificFragment extends Fragment {

    private FragmentScientificBinding binding;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bpi, bequal, bmin, bplus, bdiv, bmul, bminus, blog, bac, bc, bb1, bb2, bln, bsin, bcos, btan, binv, bsqrt, bsquare, bfact;
    TextView tvsec, tvmain;
    String pi = "3.14159265";


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentScientificBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // initialize variables
        b1 =  getView().findViewById(R.id.b1);
        b2 = getView().findViewById(R.id.b2);
        b3 = getView().findViewById(R.id.b3);
        b4 = getView().findViewById(R.id.b4);
        b5 = getView().findViewById(R.id.b5);
        b6 = getView().findViewById(R.id.b6);
        b7 = getView().findViewById(R.id.b7);
        b8 = getView().findViewById(R.id.b8);
        b9 = getView().findViewById(R.id.b9);
        b0 = getView().findViewById(R.id.b0);
        bac = getView().findViewById(R.id.bac);
        bc = getView().findViewById(R.id.bc);
        bb1 = getView().findViewById(R.id.bb1);
        bb2 = getView().findViewById(R.id.bb2);
        bpi = getView().findViewById(R.id.bpi);
        bdot = getView().findViewById(R.id.bdot);
        bequal = getView().findViewById(R.id.bequal);
        bplus = getView().findViewById(R.id.bplus);
        bminus = getView().findViewById(R.id.bminus);
        bmul = getView().findViewById(R.id.bmul);
        bdiv = getView().findViewById(R.id.bdiv);
        binv = getView().findViewById(R.id.binv);
        bsqrt = getView().findViewById(R.id.bsqrt);
        bsquare = getView().findViewById(R.id.bsquare);
        bfact = getView().findViewById(R.id.bfact);
        bln = getView().findViewById(R.id.bln);
        bsin = getView().findViewById(R.id.bsin);
        bcos = getView().findViewById(R.id.bcos);
        btan = getView().findViewById(R.id.btan);
        blog = getView().findViewById(R.id.blog);

        tvmain = getView().findViewById(R.id.tvmain);
        tvsec = getView().findViewById(R.id.tvsec);


        // append number to already existing expression
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ".");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "+");
            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "-");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "÷");
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "×");
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });


        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "(");
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText() + pi);
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "sin");
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "cos");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "tan");
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "^" + "(-1)");
            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val + "!");
            }

        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d * d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d + "²");
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "ln");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "log");
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedstr = val.replace('÷', '/').replace('×', '*');
                double result = eval(replacedstr);
                tvmain.setText((String.valueOf(result)));
                tvsec.setText(val);

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    //Factorial function
    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    // evaluate the expression
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); //Addition
                    else if (eat('-')) x -= parseTerm(); //Subtraction
                    else return x;
                }
            }
            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseTerm(); //Multiplication
                    else if (eat('/')) x /= parseTerm(); //Division
                    else return x;
                }
            }
            double parseFactor() {

                if (eat('+')) return parseFactor(); //Unary Plus
                if (eat('-')) return -parseFactor(); //Unary Minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // Parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { //Numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if ((ch >= 'a' && ch <= 'z') || ch == '.') { //Functions
                    while ((ch >= 'a' && ch <= 'z') || ch == '.') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);

                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor()); //Exponentiation
                return x;
            }

        }.parse();

    }




}