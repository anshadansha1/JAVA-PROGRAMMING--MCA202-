//Threading : It is a lightweight process.
//within a process it is possible to have one or more execution paths.
//NOTE:[There are two ways you can create  threads: 1)By Extending thread class.2)By implementing runnable interface.]

//PROGRAM : 1)Implement thread By Extending thread class.
import java.io.*;

class CThread extends Thread {
    int n;

    public CThread(int a) {
        n = a;
    }

    public void run() {
        int i;
        for (i = 0; i <= n; i++) {
            System.out.println("\ti = " + i);
        }
    }
}

public class P26_threading {
    public static void main(String args[]) {
        CThread t1, t2;
        t1 = new CThread(100);
        t2 = new CThread(150);
        System.out.println("\nBefore Thread");
        t1.start();//
        System.out.println("\nBetween Thread");
        t2.start();
        System.out.println("\nAfter Thread");
    }
}

/*
 OUTPUT:
 E:\MUHAMMAD ANSHAD P A\JAVA\class notes>java P26_threading

Before Thread

Between Thread
        i = 0
        i = 1
        i = 2
        i = 3

After Thread
        i = 4
        i = 0
        i = 1
        i = 2
        i = 3
        i = 4
        i = 5
        i = 6
        i = 7
        i = 5
        i = 6
        i = 8
        i = 9
        i = 10
        i = 11
        i = 12
        i = 13
        i = 7
        i = 8
        i = 9
        i = 14
        i = 15
        i = 16
        i = 17
        i = 18
        i = 19
        i = 20
        i = 21
        i = 10
        i = 11
        i = 22
        i = 23
        i = 24
        i = 25
        i = 26
        i = 12
        i = 13
        i = 27
        i = 28
        i = 29
        i = 30
        i = 31
        i = 32
        i = 33
        i = 34
        i = 35
        i = 36
        i = 37
        i = 38
        i = 39
        i = 40
        i = 41
        i = 42
        i = 43
        i = 44
        i = 45
        i = 46
        i = 14
        i = 15
        i = 47
        i = 48
        i = 49
        i = 50
        i = 16
        i = 17
        i = 51
        i = 52
        i = 53
        i = 54
        i = 55
        i = 56
        i = 57
        i = 58
        i = 59
        i = 60
        i = 61
        i = 62
        i = 63
        i = 64
        i = 65
        i = 66
        i = 67
        i = 18
        i = 19
        i = 20
        i = 21
        i = 22
        i = 23
        i = 24
        i = 25
        i = 26
        i = 27
        i = 28
        i = 29
        i = 30
        i = 31
        i = 32
        i = 33
        i = 34
        i = 35
        i = 68
        i = 36
        i = 69
        i = 70
        i = 37
        i = 38
        i = 39
        i = 40
        i = 41
        i = 42
        i = 43
        i = 44
        i = 45
        i = 46
        i = 47
        i = 48
        i = 49
        i = 50
        i = 51
        i = 71
        i = 52
        i = 53
        i = 54
        i = 55
        i = 72
        i = 73
        i = 74
        i = 75
        i = 76
        i = 77
        i = 78
        i = 79
        i = 80
        i = 81
        i = 82
        i = 83
        i = 84
        i = 85
        i = 86
        i = 87
        i = 88
        i = 89
        i = 90
        i = 91
        i = 92
        i = 93
        i = 94
        i = 95
        i = 96
        i = 97
        i = 98
        i = 99
        i = 100
        i = 101
        i = 102
        i = 103
        i = 104
        i = 105
        i = 106
        i = 107
        i = 108
        i = 109
        i = 110
        i = 111
        i = 112
        i = 113
        i = 114
        i = 115
        i = 116
        i = 117
        i = 56
        i = 57
        i = 58
        i = 59
        i = 60
        i = 61
        i = 62
        i = 63
        i = 64
        i = 65
        i = 66
        i = 67
        i = 68
        i = 69
        i = 70
        i = 71
        i = 72
        i = 73
        i = 118
        i = 119
        i = 120
        i = 121
        i = 122
        i = 123
        i = 74
        i = 75
        i = 76
        i = 77
        i = 78
        i = 79
        i = 80
        i = 81
        i = 82
        i = 83
        i = 84
        i = 85
        i = 86
        i = 87
        i = 88
        i = 89
        i = 90
        i = 91
        i = 92
        i = 93
        i = 94
        i = 95
        i = 96
        i = 97
        i = 98
        i = 99
        i = 100
        i = 124
        i = 125
        i = 126
        i = 127
        i = 128
        i = 129
        i = 130
        i = 131
        i = 132
        i = 133
        i = 134
        i = 135
        i = 136
        i = 137
        i = 138
        i = 139
        i = 140
        i = 141
        i = 142
        i = 143
        i = 144
        i = 145
        i = 146
        i = 147
        i = 148
        i = 149
        i = 150
 */