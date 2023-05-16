void main() {
  List<int> list1 = [1, 2, 3, 4, 5];
  List<int> list2 = [1, 2, 3, 4, 5];

  bool equal = list1.toString() == list2.toString();

  print("Lists are equal: $equal");
}
