-- 코드를 입력하세요
SELECT 
    ugb.TITLE, 
    ugb.BOARD_ID, 
    ugr.REPLY_ID, 
    ugr.WRITER_ID, 
    ugr.CONTENTS, 
    DATE_FORMAT(ugr.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
FROM USED_GOODS_BOARD AS ugb
INNER JOIN USED_GOODS_REPLY AS ugr
ON ugb.board_id = ugr.board_id
WHERE SUBSTR(ugb.CREATED_DATE, 1, 7) = '2022-10'
ORDER BY ugr.created_date ASC, ugb.TITLE ASC;