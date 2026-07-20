
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
int n = mountainArr.length();        
int low = 0, high = n - 1;
while (low < high) {
    int mid = low + (high - low) / 2;

    if (mountainArr.get(mid) > mountainArr.get(mid + 1))
        high = mid;
    else
        low = mid + 1;
}

int peak = low;
int l = 0, r = peak;

while (l <= r) {
    int mid = l + (r - l) / 2;

    if (mountainArr.get(mid) == target)
        return mid;

    if (mountainArr.get(mid) < target)
        l = mid + 1;
    else
        r = mid - 1;
}
l = peak + 1;
r = n - 1;

while (l <= r) {
    int mid = l + (r - l) / 2;

    if (mountainArr.get(mid) == target)
        return mid;

    if (mountainArr.get(mid) > target)
        l = mid + 1;
    else
        r = mid - 1;
}

return -1;

    }
}