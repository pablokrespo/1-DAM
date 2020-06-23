package boletin11_3;
public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        if (comprobarDia(dia) == true) {
            this.dia = dia;
        }
        else dia=1;
        if (mes < 13 && dia > 0) {
            this.mes = mes;
        }
        else mes=1;
        this.ano = ano;

    }

    public Fecha() {
        dia = 1;
        mes = 1;
        año = 2001;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (comprobarDia(dia) == true) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes<13&& mes>0) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean comprobarDia(int dia) {
        if (((dia < 32 && dia > 0) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                || ((dia < 31 && dia > 0) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                || (((dia < 29 && dia > 0) && (mes == 2)) || (dia < 30 && dia < 0) && (mes == 2) && ((ano % 100 != 0 && ano % 4 == 0) || (ano % 400 == 0)))) {
            return true;
        } else {
            return false;
        }
    }
}
