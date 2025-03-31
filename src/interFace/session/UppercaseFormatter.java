package interFace.session;

class UppercaseFormatter implements MessageFormatter {
    @Override
    public String formatMessage(String message) {
        return message.toUpperCase();
    }
}


