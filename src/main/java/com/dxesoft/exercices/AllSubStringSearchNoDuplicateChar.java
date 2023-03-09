package com.dxesoft.exercices;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AllSubStringSearchNoDuplicateChar {

   /* public static int findSubstrings(String s) {
        System.out.println(s);
        Set<SubStr> subStrings = new HashSet<>();
        int count = 0;

        int size = s.length();

        for (int i = 0; i < size; i++) {
            StringBuilder subString = new StringBuilder();

            for (int j = i; j < size; j++) {
                final char letter = s.charAt(j);

                if (subString.indexOf(String.valueOf(letter)) == -1) {
                    subString.append(letter);
                    final String tmp = subString.toString();

                    SubStr subStr = new SubStr(tmp, i, j);

                    subStrings.add(subStr);
                } else {
                    break;
                }
            }
        }

        return subStrings.size();
    }*/

    private static class SubStr {
        private String subStr;
        private int startIndex;
        private int endIndex;

        public SubStr(String subStr, int startIndex, int endIndex) {
            this.subStr = subStr;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public String getSubStr() {
            return subStr;
        }

        public void setSubStr(String subStr) {
            this.subStr = subStr;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        public int getEndIndex() {
            return endIndex;
        }

        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SubStr subStr1 = (SubStr) o;
            return startIndex == subStr1.startIndex && endIndex == subStr1.endIndex && Objects.equals(subStr, subStr1.subStr);
        }

        @Override
        public int hashCode() {
            return Objects.hash(subStr, startIndex, endIndex);
        }
    }


    public static int findSubstrings(String s) {
        System.out.println(s);
        Set<SubStr> subStrings = new HashSet<>();
        int count = 0;

        int size = s.length();

        for (int i = 0; i < size; i++) {
            String subString = "";

            for (int j = i; j < size; j++) {
                final char letter = s.charAt(j);

                if (!subString.contains("" + letter )) {
                    subString += letter;

                    SubStr subStr = new SubStr(subString, i, j);

                    subStrings.add(subStr);
                } else {
                    break;
                }
            }
        }

        return subStrings.size();
    }


}
