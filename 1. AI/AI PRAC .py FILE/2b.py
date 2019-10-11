#implement Tower of Hanoi
def hanoi(disks,source,auxillary,target):
    if disks ==1:
        print("Move Disk1 from peg{} to peg{}.".format(source,target))
        return
    hanoi(disks-1,source,target,auxillary)
    print("Move Disk{} from peg{} to peg{}.".format(disks,source,target))
    hanoi(disks-1,auxillary,source,target)
disks=(int(input("Enter Number of disks:")))
hanoi(disks,'A','B','C')


