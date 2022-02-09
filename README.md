# buildpacks検証用プロジェクト

## 主な機能
* Todoの一覧表示
* Todoの作成
* Todoの詳細表示

## ライブラリー
build.gradle参照

## 注記
ローカル環境でテストする際には、MySQLは、docker-composeで起動している

<Project-root>/infrastructure/docker-compose.yml

### 起動方法
infrastructureディレクトリから

```shell
docker-compose up
```

## buildpacksによるコンテナイメージ作成方法
<Project-root>ディレクトリから

```shell
./gradlew bootBuildImage
```


## エラー対処ログ

以下のメッセージがbuildpacks実行時に出た

```shell
* What went wrong:
Execution failed for task ':bootJar'.
> Entry BOOT-INF/classes/META-INF/com/example/demo/domain/repository/TodoRepository/findAll.sql is a duplicate but no duplicate handling strategy has been set. Please refer to https://docs.gradle.org/7.3.3/dsl/org.gradle.api.tasks.Copy.html#org.gradle.api.tasks.Copy:duplicatesStrategy for details.
```