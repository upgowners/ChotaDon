p<-matrix(c(1:10),nrow=3,ncol=3,byrow=TRUE)
q<-matrix(c(1:10),nrow=3,ncol=3,byrow=FALSE)
print(p)
print(q)
print(add<-p+q)
print(sub<-p-q)
print(mul<-p%*%q)       #multiplication of matrix.
print(div<-p/q)
print(t(p))  #transpose
print(solve(p))         #not working
print((t(p))/(det(p)))  #inverse of a matrix.


#mean
v<-(c(1,0.5,0.33))
print(result<-mean(v))    #arithematic mean
print(1/mean(1/v))        #harmonic mean
n=length(v)               # total length of vector v.
print(prod(v)^(1/n))      # gemotric mean

#median
m<-c(8,10,16,14,10,5,2)
print(median(m))

#mode
mode<-function(m){
	uniqv<-unique(m)
	uniqv[which.max(tabulate(match(m,uniqv)))]
}
m<-c(8,10,16,5,2,14)
print(mode(m))

#linear regression
v<-c(23,45,66,56)
u<-c(2,8,5,6)
print(r<-lm(v~u))
print(summary(r))


v<-c(23,45,66,56)
u<-c(2,8,5,6)
png(file="Linear.png")
plot(v,u,col="red",main="M$T",abline(lm(v~u)),cex=1.6,pch=10,xlab="M",ylab="T)

#least square mean
chisq.test(data)
install.packages("MASS")
library("MASS")
print(str(Cars93))
library("MASS")
car.data<-data.frame(Cars93$AirBags,Cars93$Type)
car.data=table(Cars93$AirBags,Cars93$Type)
print(car.data)








v<-matrix(c(0,20,1,34,2,27,3,15,4,3,5,1),nrow = 2,ncol=6)
print(v)
chisq.test(v)


obs<-c(402,358,273,467)
print(obs)
chisq.test(obs)

exp<-c(375,375,375,375)
print(exp)
chisq.test(exp)






x <- c(151, 174, 138, 186, 128, 136, 179, 163, 152, 131)
y <- c(63, 81, 56, 91, 47, 57, 76, 72, 62, 48)
relation <- lm(y~x)
png(file = "linearregression.png")
plot(y,x,col = "blue",main = "Height & Weight Regression",
abline(lm(x~y)),cex = 1.3,pch = 16,xlab = "Weight in Kg",
ylab = "Height in cm")
dev.off()
plot(y,x,col = "blue",main = "Height & Weight Regression",
abline(lm(x~y)),cex = 1.3,pch = 16,xlab = "Weight in Kg",
ylab = "Height in cm")




v<-c(7,12,28,3,41)
png(file="linear_chart.jpg")
plot(v,type="o")
dev.off()
plot(v,type="o")















a<-seq(-5,5,by=0.2)
b<-dnorm(a,mean=1.5,sd=0.5)
png(file="Dnorm.png")
plot(a,b)
dev.off()
plot(a,b)
dev.off()