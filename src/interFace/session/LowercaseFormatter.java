package interFace.session;

class LowercaseFormatter implements MessageFormatter {
    @Override
    public String formatMessage(String message) {
        return message.toLowerCase();
    }
}

