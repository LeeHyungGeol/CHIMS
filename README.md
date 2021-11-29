# CHIMS
병원 재고 관리 시스템 (Cardinal Health Inventory Management Solutions)

## Branch

Branch는 크게 3가지로 분류된다.(사실상은 더 많지만 가장 큰 분류로) `master(main)`, `develop`, `feat`

정석적인 설명은 아니지만 간략하게 나마 각각의 이름에 대해 설명한다.

- `feat` : 기능을 새로 만들 때 사용
- `develop` : application을 배포 전 취합할 때 사용
- `master(main)` : application을 배포할 때 사용(오류가 없는 완전한 상태)

### Command Description

**Branch Naming Convention** : `feat/nickname/functionName`
- EX) `feat/LeeHyungGeol/userMain`

```
git branch feat/LeeHyungGeol/userMain
git checkout feat/LeeHyungGeol/userMain
git fetch origin
### 변경되었다는 로그가 나오겠죠?
git merge
# or git pull 로 한번에 해결 가능!
... # local에서 작업 후 
git add .
git commit -m 'yyyy-mm-dd/nickname/변경사항'
git push origin feat/LeeHyungGeol/userMain
```

**branch 명령으로 새로운 브랜치를 생성 &  checkout 으로 해당 브랜치로 HEAD를 이동**

git 저장소는 원격서버(remote)와 로컬(local)에 둘 다 존재

- `branch` : 기존의 코드와 관계없는 개별적인 작업장
  - 코드를 여러가지의 브랜치로 나누어서 관리하면 개발/협업하기 수월
- `checkout` : checkout 으로 해당 브랜치로 HEAD를 이동
- `fetch & merge (pull)`
  - `fetch` : 서버에 존재하지만 로컬에 없는 데이터를 받아와 저장함.
    - `git fetch origin`
  - `merge` : 브랜치끼리 합치는 것
    - 추가한 브랜치에서 작업이 완료되면 다시 메인 브랜치로 합칠 때 사용한다.
    - merge commit이 생성됨
- `pull` : fetch  +  merge
- `push` : 로컬 브랜치의 내용을 원격 서버로 전송
  - `git push origin 브랜치명`



