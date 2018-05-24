package com.company.task01;

public class DataTypesTester {
    public static void TestByte(){
        byte a = 8, b = 5, c;
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = (byte)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (byte)( a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (byte)( a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (byte)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c =(byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 8;
        // unary minus
        c = (byte)(-a);
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = (byte)(+a);
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 8;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 8;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 8;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 8;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c =(byte)(a & b);
        // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte)(a | b);
        // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c =(byte)( a ^ b);
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c =(byte) ~a;
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        c = (byte)(a << 1);
        // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = (byte) (a >> 1);
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -8;
        c = (byte) (a >> 1);
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 8;
        c = (byte) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        int in = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c =(byte) in;
        System.out.printf("int = byte: c = %d --> c = %d\n", in, c);
        c =(byte) sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
         // c = (byte)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void TestShort(){
        short a = 320, b = 500, c;
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = (short)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (short)( a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (short)( a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (short)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 320;
        // unary minus
        c = (short)(-a);
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = (short)(+a);
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 320;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 320;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 320;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 320;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c =(short)(a & b);
        // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short)(a | b);
        // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c =(short)( a ^ b);
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c =(short) ~a;
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        c = (short)(a << 1);
        // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = (byte) (a >> 1);
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -320;
        c = (short) (a >> 1);
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 320;
        c = (short) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 320;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        int in = 33000;
        byte bt = 123;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c =(short) in;
        System.out.printf("int = byte: c = %d --> c = %d\n", in, c);
        c = bt;
        System.out.printf("int = short: c = %d --> c = %d\n", bt, c);
        c = (short) ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (short)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void TestInt(){
        int a = 8, b = 5, c;
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 8;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 8;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 8;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 8;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 8;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b;
        // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a | b;
        // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a ^ b;
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = ~a;
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        c = a << 1;
        // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = a >> 1;
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -8;
        c = a >> 1;
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 8;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void TestLong(){
        long a = 8, b = 5, c;
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c =  a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c =  a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 8;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 8;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 8;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 8;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 8;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b;
        // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = a | b;
        // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = a ^ b;
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = ~a;
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        c = a << 1;
        // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        c = a >> 1;
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = -8;
        c = a >> 1;
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = 8;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),Long.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int in = 255000;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = in;
        System.out.printf("int = byte: c = %d --> c = %d\n", in, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c =  ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c =  bt;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", bt, c);
        c = (long) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (long)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void TestFloat(){
        float a = 8.0F, b = 5.0F, c;
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c =  a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c =  a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 8.0F;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 8.0F;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 8.0F;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 8.0F;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 8.0F;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        // c = a & b;
        // bitwise AND
        // System.out.printf("%d & %d = %d\n", a, b, c);
        // System.out.println("in binary form:");
        // System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        //        Integer.toBinaryString(b), Integer.toBinaryString(c));
        // c = (a | b);
        // bitwise OR
        // System.out.printf("%d | %d = %d\n", a, b, c);
        // System.out.println("in binary form:");
        // System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        //        Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = ( a ^ b);
//        // bitwise XOR
//        System.out.printf("%d ^ %d = %d\n", a, b, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = ~a;
//        // bitwise unary compliment
//        System.out.printf("~%d = %d\n", a, c);
//        System.out.println("in binary form:");
//        c = (a << 1);
//        // left shift
//        System.out.printf("%d << 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(c));
//        c =  (a >> 1);
//        // right shift
//        System.out.printf("%d >> 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(c));
//        a = -8.0f;
//        c =  (a >> 1);
//        // right shift
//        System.out.printf("%d >> 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(c));
//        a = 8.0f;
//        c =  (a >>> 1); // zero fill right shift
//        System.out.printf("%d >>> 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
//        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
//        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
//        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
//        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
//        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
//        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        int in = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        byte bt = 123;
        double d = 123456789.625;
        boolean bool = true;
        c = in;
        System.out.printf("int = byte: c = %d --> c = %d\n", in, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c =  ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c =  l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c =  bt;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", bt, c);
        c = (float) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (byte)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void TestDouble(){
        double a = 8.0, b = 5.0, c;
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c =  a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c =  a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 8.0F;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 8.0F;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 8.0F;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 8.0F;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 8.0F;
        System.out.printf("%d-- = %d\n", a, a--);
//        System.out.println("\n***** Bitwise Operators *****");
//         c = a & b;
//        bitwise AND
//         System.out.printf("%d & %d = %d\n", a, b, c);
//         System.out.println("in binary form:");
//         System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(b), Integer.toBinaryString(c));
//         c = (a | b);
//         bitwise OR
//         System.out.printf("%d | %d = %d\n", a, b, c);
//         System.out.println("in binary form:");
//         System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c =( a ^ b);
//        // bitwise XOR
//        System.out.printf("%d ^ %d = %d\n", a, b, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = ~a;
//        // bitwise unary compliment
//        System.out.printf("~%d = %d\n", a, c);
//        System.out.println("in binary form:");
//        c = (a << 1);
//        // left shift
//        System.out.printf("%d << 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(c));
//        c =  (a >> 1);
//        // right shift
//        System.out.printf("%d >> 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(c));
//        a = -8.0;
//        c =  (a >> 1);
//        // right shift
//        System.out.printf("%d >> 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(c));
//        a = 8.0;
//        c = (a >>> 1); // zero fill right shift
//        System.out.printf("%d >>> 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
//                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 5;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
//        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
//        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
//        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
//        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
//        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
//        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        int in = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        byte bt = 123;
        float fl = 123.525F;
        boolean bool = true;
        c = in;
        System.out.printf("int = byte: c = %d --> c = %d\n", in, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c =  ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c =  l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c =  bt;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", bt, c);
        c = fl;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", fl, c);
        // c = (byte)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void TestChar(){
        char a = 'B', b = 'F', c;
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = (char) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (char) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (char) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (char) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (char) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 'B';
        // unary minus
        c = (char) -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = (char) +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 'B';
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 'B';
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 'B';
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 'B';
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
         c = (char) (a & b);
         //bitwise AND
         System.out.printf("%d & %d = %d\n", a, b, c);
         System.out.println("in binary form:");
         System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
         c = (char) (a | b);
        // bitwise OR
         System.out.printf("%d | %d = %d\n", a, b, c);
         System.out.println("in binary form:");
         System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c =(char) ( a ^ b);
        // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c =(char) ~a;
        // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        c = (char) (a << 1);
        // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = (char) (a >> 1);
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 'B';
        c = (char) (a >> 1);
        // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 8;
        c = (char) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 'C';
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        int in = 1;
        short sh = -32000;
        float fl = 5.0F;
        long l = 100000000000000000L;
        byte bt = 123;
        double d = 123456789.625;
        boolean bool = true;
        c = (char) in;
        System.out.printf("int = byte: c = %d --> c = %d\n", in, c);
        c = (char)sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = (char) fl;
        System.out.printf("int = char: c = '%c' --> c = %d\n", fl, c);
        c = (char) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", bt, c);
        c = (char) bt;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", bt, c);
        c = (char) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (byte)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void TestBoolean(){
        boolean a = true, b = false, c;
        System.out.println("\n***** Arithmetical Operators *****");
        // c = a + b; // addition
        // c = a - b; // subtraction
        // c = a * b; // multiplication
        // c = a / b; // division
        // c = a % b; // modulus
        // c = -a; // unary minus
        // c = +a; // unary plus
        // c = ++a; // prefix increment
        // c = a++; // postfix increment
        // c = --a; // prefix decrement
        // c = a--; // postfix decrement
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // c = ~a; // bitwise unary compliment
        // c = a << 1; // left shift
        // c = a >> 1; //right shift
        // c = a >>> 1; // zero fill right shift

        System.out.println("\n***** Assignment Operators *****");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
        // c += a;
        // c -= a;
        // c *= a;
        // c /= a;
        // c %= a;
        // c >>= 1;
        // c <<= 1;
        // c >>>= 1;
        System.out.println("\n***** Relational Operators *****");
        // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
        // c = a > b; // greater than
        // c = a >= b; // greater than or equal to
        // c = a < b; // less than
        // c = a <= b; // less than or equal to
        System.out.println("\n***** Logical Operations *****");
        c = a && b;
        // logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b;
        // logical OR
        System.out.printf("%b || %b = %d\n", a, b, c);
        c = a ^ b;
        // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // logical NOT
        System.out.printf("!%b --> %b\n", a, !a);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");
        // byte bt = 1;
        // short sh = -32000;
        // char ch = '\u0002';
        // long l = 100000000000000000L;
        // float f = 1.9f;
        // double d = 123456789.625;
        boolean bool = true;
        //c = (boolean) bt;
        // c = (boolean) sh;
        // c = (boolean) ch;
        // c = (boolean) l;
        // c = (boolean) f;
        // c = (boolean) d;
        c = bool;
    }
}
