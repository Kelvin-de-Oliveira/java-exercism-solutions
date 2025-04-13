class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        char c;

        for(int i = 0; i < identifier.length(); i++ ){
            if(identifier.charAt(i) == ' ') {
                sb.append('_');
                continue;
            }
            else if (identifier.charAt(i) == '-'&& i + 1 < identifier.length()){
                i++;
                sb.append(Character.toUpperCase(identifier.charAt(i)));
                continue;
            }
            switch (identifier.charAt(i)){
                case '4':
                    sb.append('a');
                    break;
                case '3':
                    sb.append('e');
                    break;
                case '0':
                    sb.append('o');
                    break;
                case '1':
                    sb.append('l');
                    break;
                case '7':
                    sb.append('t');
                    break;
                default:
                    if (Character.isLetter(identifier.charAt(i))) {
                        sb.append(identifier.charAt(i));
                    }

            }
        }
            return sb.toString();
    }
}
