// Question 05-Excel Sheet Column Title
// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.





class Question05 {
    public String convertToTitle(int columnNumber) {
        if (columnNumber == 0) return "";
        columnNumber--;
        char c = (char) ('A' + columnNumber % 26);
        return convertToTitle(columnNumber / 26) + c;
    }
}