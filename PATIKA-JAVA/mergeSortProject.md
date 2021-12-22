### [16,21,11,8,12,22] dizisinin Merge Sort aşamaları
- [16,21,11,8,12,22] => input
- [16,21,11] | [8,12,22] => O(n)
- [16,21] , [11] | [8,12] , [22] => O(n)
- [16] , [21] , [11] | [8] , [12], [22] => O(n)
- [16,21] , [11] | [8,12] , [22] => O(n)
- [11,16,21] | [8,12,22] => O(n)
- [8,11,12,16,21,22] => O(n)

### Time Complexity
- bölme birleştirme işlem sayısı (satır) 2^x = n => logn
- her bir satır için işlem sayısı O(n)
- O(nlogn)
