public class Main {

    private static String removeExtraSpaces(String s) {
        StringBuilder strBuilder = new StringBuilder();
        String line = s.trim();
        boolean isSpace = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(line.charAt(i));
                isSpace = false;
            }
        }

        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String chehov = " Воспитанные люди должны удовлетворять следующим условиям:\n" +
                " Они уважают человеческую личность, всегда снисходительны, мягкие, вежливые, уступчивые…\n" +
                " Они уважают чужую собственность, а потому платят долги.\n" +
                " Не лгут даже в пустяках… Они не лезут с откровенностями, когда их не спрашивают…\n" +
                " Они не унижают себя с тою целью,          чтобы вызвать в другом сочувствие…\n" +
                " Они не суетны…\n" +
                " Если имеют в себе талант, то уважают его… Они жертвуют для него всем…\n" +
                " Они воспитывают в себе эстетику*…\n" +
                "  Тут нужны беспрерывные дневной и ночной труд, вечное чтение, воля… Тут дорог каждый час.";

        System.out.println(removeExtraSpaces(chehov));
    }
}