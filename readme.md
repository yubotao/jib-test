执行命令：
`mvn compile jib:build -Djib.to.auth.username=user -Djib.to.auth.password=pass`
可以通过验证，将镜像上传到对应的目标库`<to>`中