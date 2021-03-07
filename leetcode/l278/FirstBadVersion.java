package leetcode.l278;

public class FirstBadVersion {

  public static void main(String[] args) {
    FirstBadVersion firstBadVersion = new FirstBadVersion();
    System.out.println(firstBadVersion.firstBadVersion(2126753390));
  }

  public int firstBadVersion(int n) {
    int left = 1, right = n, version = 0;
    while (left <= right) {
      version = left + (right - left) / 2; // 如果用java，不能写成(left+right)/2,因为(left+right)有可能会导致数据溢出。
      if (isBadVersion(version)) {
        if (isBadVersion(version - 1)) {
          right = version - 1;
        } else {
          break;
        }
      } else {
        left = version + 1;
      }
    }

    return version;

  }

  public boolean isBadVersion(int n) {
    return n >= 1702766719 ? true : false;
  }
}
