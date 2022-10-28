# Git-Practice
Why? Github와 Git 핵초짜를 벗어나기위한 몸부림, 회사에서 코딩보다 git못 해서 뚜까 맞음.

How? Git을 하도 못해서 보이는 명령어는 다 해볼예정

현재 할 줄 아는 것
> 2022-03-15
1. git init
2. git status
3. git branch
4. git branch -b a_branch
5. git branch a_branch 
6. git checkout a_branch
7. commit
8. push
9. pull request

> 2022-03-29
10. git clone repository.git
11. git reset --hard HEAD
* 마지막 commit 내용 백업

> 2022-03-31
12. git config --list
13. git config user.name
14. git config user.email
* 자꾸 회사계정으로 commit돼서 알아냄

> 2022-04-01
15. git rm -r --cached .
16. git add .
* git ignore 적용이 안 돼서 캐시 삭제 후 재생성

> 2022-04-05
17. git add
18. git status
* commit이 첫 단계인 줄 알았다. 왜냐하면 나는 terminal을 안 쓰고 android studio가 제공하는 기능을 썼기 때문. 위 git add는 그냥 하라해서 유령마냥 쓴 명령어..
commit전에 staging시키는 add라는 명령어를 알게 됨. 자연스럽게 현재 상태를 나타내는 git status도 알게 됨.

> 2022-10-28
오랜만에 작성한다. 이제 좀 숙달되었다.
19. git status
* 현재 작업 디렉토리 및 인덱스 상황. untrack 파일을 볼 수 있음
20. git log
* commit, push, pull merge 같은 히스토리를 볼 수 있는 명령어
21. git reset [HEAD^x or commit SHA-1 Hash code]
* HEAD^x는 최근 커밋 중 몇단계를 리셋할지이고 해시코드를 넣으면 해당 커밋 윗 단계까지 풀림
option: --soft, --hard
soft: 커밋은 해제하지만 작업 디렉토리엔 남아있음
hard: 커밋 해제와 동시에 작업 디렉토리도 날라감.
