def search(matrix, target):
	arr = [val for row in matrix for val in row]
	low = 0
	high = len(arr)
	mid = (low+high)/2
	while(low<high):
		if(mid<target):
			high = mid
			mid = low+high/2
		elif(mid>target):
			low = mid
			mid = low+high/2
		if(mid == target):	
			return True
	return False

#No extra space:

def optimized(matrix, target):
	rows = len(matrix)
	cols = len(matrix[0])
	n = rows*cols
	
	low = 0
	high = n-1
	while low<=high:
		mid = (low+high)//2
		c = mid%cols
		r = mid//cols
		if matrix[r][c] == target:
			return True 
		elif matrix[r][c] < target:
			low = mid+1
		elif matrix[r][c] >= target:
			high = mid-1
	return False
		
