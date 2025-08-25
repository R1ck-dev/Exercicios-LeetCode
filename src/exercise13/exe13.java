package exercise13;

public class exe13 {
    public static int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i <= s.length() - 2; i++) {
            int valorAtual = RomanSimbols.fromCode(String.valueOf(s.charAt(i))).somar();
            int proximoValor = RomanSimbols.fromCode(String.valueOf(s.charAt(i + 1))).somar();

            if (valorAtual < proximoValor) {
                sum -= valorAtual;
            } else {
                sum += valorAtual;
            }
        }

        sum += RomanSimbols.fromCode(String.valueOf(s.charAt(s.length() - 1))).somar();

        return sum;
    }

    public enum RomanSimbols {
        ROMANI("I") {

            @Override
            public int somar() {
                return 1;
            }

        },
        ROMANV("V") {

            @Override
            public int somar() {
                return 5;
            }

        },
        ROMANX("X") {

            @Override
            public int somar() {
                return 10;
            }

        }, 
        ROMANL("L") {

            @Override
            public int somar() {
                return 50;
            }

        },
        ROMANC("C") {

            @Override
            public int somar() {
                return 100;
            }

        },
        ROMAND("D") {

            @Override
            public int somar() {
                return 500;
            }

        },
        ROMANM("M") {

            @Override
            public int somar() {
                return 1000;
            }

        };

        private final String descricao;

        RomanSimbols(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return this.descricao;
        }

        public abstract int somar();

        public static RomanSimbols fromCode(String c) {
            for (RomanSimbols rs : RomanSimbols.values()) {
                if (rs.getDescricao().equals(c)) {
                    return rs;
                }
            }
            throw new IllegalArgumentException("Código Inválido");
        }
        
    }
}
