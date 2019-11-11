package codechef.codevitaround2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MatrixRotation {
    static char[][] chars;
    static int[][] xes;

    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        chars = new char[n][n];
        int[] ans = new int[n / 2];
        xes = new int[n / 2][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                chars[i][j] = tokenizer.nextToken().charAt(0);
            }
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                if (chars[j][i] == 'X') {
                    xes[i][0] = i;
                    xes[i][1] = j;
                    xes[i][2] = 1;
                    ans[i] = -(j - i);

                    break;
                } else if (chars[j][n - 1 - i] == 'X') {
                    xes[i][0] = n - i - 1;
                    xes[i][1] = j;
                    xes[i][2] = 2;

                    ans[i] = (j + n - 1 - (3 * i));
                    break;
                } else if (chars[i][j] == 'X') {
                    xes[i][0] = j;
                    xes[i][1] = i;
                    xes[i][2] = 3;
                    ans[i] = (j - i);
                    break;
                } else if (chars[n - i - 1][j] == 'X') {
                    xes[i][0] = j;
                    xes[i][1] = n - 1 - i;
                    ans[i] = -(j + n - 1 - (3 * i));
                    xes[i][2] = 4;
                    break;
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(ans));
        char[][] mat = createRotatedMatrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(xes[i]));
        }
    }

    private static char[][] createRotatedMatrix(int n) {
        char[][] mat = new char[n][n];
        for (int i = 0; i < n / 2; i++) {
            int colVal = xes[i][0];
            int rowVal = xes[i][1];
            if (xes[i][2] == 2) {
                for (int j = i; j <n - i - 1; j++) {
                    System.out.print(i + " " + j + "  ");
                    System.out.print(j + " " + (n - i - 1) + "  ");
                    System.out.print((n - 1 - i) + " " + (n - 1 - j) + "  ");
                    System.out.print((n - j - 1) + " " + i + "  ");
                    System.out.println();
                    if (rowVal < (n - i - 1)) {
                        mat[i][j] = chars[rowVal][colVal];
                        mat[j][(n - i - 1)] = chars[colVal][(n - i - 1) - rowVal];
                        mat[(n - 1 - i)][n - 1 - j] = chars[(n - i - 1) - rowVal][colVal - (n - 1 - i)];
                        mat[(n - j - 1)][i] = chars[colVal - (n - 1 - i)][rowVal];
                        rowVal++;
                    } else {
                        mat[i][j] = chars[rowVal][colVal];
                        mat[j][(n - i - 1)] = chars[colVal][(n - i - 1) - rowVal];
                        mat[(n - 1 - i)][(n - 1 - j)] = chars[(n - i - 1) - rowVal][(n - 1 - i) - colVal];
                        mat[(n - j - 1)][i] = chars[(n - 1 - i) - colVal][rowVal];
                        colVal--;
                    }
                }
            } else if (xes[i][2] == 3) {
                for (int j = i; j < n - i - 1; j++) {

                    if (colVal < (n - i - 1)) {
                        mat[i][j] = chars[rowVal][colVal];
                        mat[j][(n - i - 1)] = chars[colVal][(n - i - 1)];
                        mat[(n - 1 - i)][n - 1 - j] = chars[(n - i - 1)][(n-i-1-colVal)];
                        System.out.println(chars[(n - i - 1)][(n-i-1-colVal)]);
                        mat[(n - j - 1)][i] = chars[(n-i-1)-colVal][i];
                        colVal++;
                    } else {
                        mat[i][j] = chars[rowVal][colVal];
                        mat[j][(n - i - 1)] = chars[colVal][(n-i-1) - rowVal];
                        mat[(n - 1 - i)][(n - 1 - j)] = chars[(n-i-1) - rowVal][i];
                        System.out.println(chars[(n-i-1) - rowVal][i]);
                        mat[(n - j - 1)][i] = chars[i][rowVal];
                        rowVal++;
                    }
                }
            }
            else if (xes[i][2] == 4) {
                for (int j = i; j < n - i - 1; j++) {

                    if (colVal !=i) {
                        mat[i][j] = chars[rowVal][colVal];
                        mat[j][(n - i - 1)] = chars[colVal][i];
                        mat[(n - 1 - i)][n - 1 - j] = chars[i][j];
                        mat[(n - j - 1)][i] = chars[j][rowVal];
                        colVal--;
                    } else {
                        mat[i][j] = chars[rowVal][colVal];
                        mat[j][(n - i - 1)] = chars[colVal][j];
                        mat[(n - 1 - i)][(n - 1 - j)] = chars[j][(n-i-1)];
                        mat[(n - j - 1)][i] = chars[(n-i-1)][rowVal];
                        rowVal--;
                    }
                }
            }

            System.out.println();

        }
        return mat;
    }
}
