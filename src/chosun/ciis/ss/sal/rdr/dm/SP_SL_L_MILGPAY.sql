PROCEDURE SP_SL_L_MILGPAY (
         ov_errcode          OUT    VARCHAR2    -- ERROR CODE
        ,ov_errmsg           OUT    VARCHAR2    -- ERROR MESSAGE
        ,iv_rdr_no           IN     VARCHAR2    -- 독자번호
        ,iv_frpaydt          IN     VARCHAR2    -- from 지급일자
        ,iv_topaydt          IN     VARCHAR2    -- to   지급일자
        ,iv_paybasicd        IN     VARCHAR2    -- 지급기준코드
        ,iv_medicd           IN     VARCHAR2    -- 매체코드
        ,iv_pageno           IN     NUMBER      -- 현재페이지
        ,iv_pagesize         IN     NUMBER      -- 페이지당 보여줄 건수
        ,ov_totalcnt         OUT    NUMBER      -- 총건수
        ,ov_paycur           OUT    PG_CO_REFCUR.COMMONCUR  -- 지급내역리스트(RESULT SET )]
)
AS
/*=================================================================================================
&& CURSORINFO ov_paycur RDR_NO VARCHAR2 MILGPAYDT VARCHAR2 MILGPAYNO VARCHAR2 MEDINM VARCHAR2 PAYBASINM VARCHAR2 PONT NUMBER HDQTALLMAMT NUMBER BOALLMAMT NUMBER BONM VARCHAR2 MARGAMYN VARCHAR2 RNUM NUMBER &&
=================================================================================================*/
/*=================================================================================================
-- SP    명 : SP_SL_L_MILGPAY
-- 시스템명 : 판매지국
-- 업 무 명 : 판매지국 독자-마일리지지급내역
-- 기 능 명 : 독자별 마일리지지급내역 리스트
-- 작 성 일 : 2004-06-03
-- 작 성 자 : 김영윤

-- 사용 테이블
--   SELECT : TACOD_MILGPAY	마일리지지급내역
--   INSERT :
--   UPDATE :
--   DELETE :

-- 특기사항 :
=================================================================================================*/
/*=================================================================================================
-- 수 정 일 :
-- 수 정 자 :
-- 수정내용 :
=================================================================================================*/
    --사용자 정의 예외
    USER_EXCEPTION  EXCEPTION;                      --사용자 EXCEPTION 정의
    rv_expcode      VARCHAR2(50)   :=  '';          --사용자 에러코드
    rv_expmsg       VARCHAR2(500)   :=  '';         --사용자 에러메세지
    rv_outersql     VARCHAR2(4000)  :=  '';         --내부 Query 변수
    rv_strsql       VARCHAR2(4000)  :=  '';         --CURSOR를 위한 Query 변수
    rv_strwhere     VARCHAR2(1000)  :=  '';         --CURSOR를 위한 Query 변수
    rv_cntsql       VARCHAR2(10000)  :=  '';        --총건수 Query 변수
    rv_startno      NUMBER := 0;                    --시작레코드 넘버
    rv_endno        NUMBER := 0;                    --끝레코드 넘버

	rv_milgmagamdt   VARCHAR2(8)        :=  SF_SL_FIND_LAST_MILGMAGAMDT();        --마일리지 분담금 최종마감일자
BEGIN

    rv_startno := (iv_pageno - 1) * iv_pagesize + 1;
    rv_endno := iv_pageno * iv_pagesize;

	rv_strsql :=  '	SELECT  '
				||'			 RDR_NO		'											 -- 독자번호
				||'			,MILGPAYDT	'											 -- 마일리지지급일자
				||'			,MILGPAYNO	'											 -- 마일리지지급번호
				||'			,SF_CO_FIND_CICDNM(''96'',''20'',MEDICD) MEDINM 		'-- 매체명
				||'			,SF_CO_FIND_CICDNM(''97'',''703'',PAYBASICD) PAYBASINM	'-- 지급기준명
				||'			,PONT			'										 -- 포인트
				||'			,HDQTALLMAMT	'										 -- 본사분담금
				||'			,BOALLMAMT		'										 -- 지국지사분담금
				||'			,SF_CO_FIND_BONM(BOCD) BONM	'							 -- 지급지국명
				||'         ,CASE '
				||'				WHEN PAYSTATCD IN (''20'',''30'') OR '''||rv_milgmagamdt||''' >= TO_CHAR(MILGPAYDT) THEN ''Y'' '
				||'				ELSE ''N'' '
				||'			 END AS MARGAMYN	'		    -- 마일리지 분담금마감 여부
				||'         ,ROW_NUMBER() OVER(ORDER BY MILGPAYDT DESC, MILGPAYNO DESC) RNUM ' -- row number
				||'   FROM '
				||'  		TACOD_MILGPAY '
				||'  WHERE  RDR_NO = ''' || iv_rdr_no || ''' '
				||'    AND  MILGPAYDT BETWEEN '''|| iv_frpaydt ||''' AND '''||iv_topaydt||''' ';
				
    --지급기준코드
    IF iv_paybasicd IS NOT NULL  THEN
		rv_strwhere := 'AND  PAYBASICD = '''||iv_paybasicd||''' ';
	END IF;
	
	--매체코드
	IF iv_medicd IS NOT NULL  THEN
		rv_strwhere := rv_strwhere
		             ||'AND  MEDICD = '''||iv_medicd||''' ';
	END IF;		

    rv_strsql := rv_strsql || rv_strwhere;

    rv_outersql := 'SELECT * FROM (' || rv_strsql   || ')'
                   || ' WHERE RNUM BETWEEN ' || rv_startno || ' AND ' || rv_endno;


    OPEN ov_paycur FOR rv_outersql;

    rv_cntsql := 'SELECT COUNT(*) FROM (' || rv_strsql || ')';

    EXECUTE IMMEDIATE rv_cntsql INTO ov_totalcnt;

    EXCEPTION
        WHEN USER_EXCEPTION THEN
            ov_errcode := rv_expcode;
            ov_errmsg  := rv_expmsg;
        WHEN  NO_DATA_FOUND  THEN
            ROLLBACK;
            SP_CO_E_ERRCDMSG(ov_errcode,ov_errmsg,'U',SQLERRM(SQLCODE),'처리하고자 하는 데이타를 찾지 못했습니다.','[SP_SL_L_MILGPAY]');
        WHEN  TOO_MANY_ROWS  THEN
            ROLLBACK;
            SP_CO_E_ERRCDMSG(ov_errcode,ov_errmsg,'U',SQLERRM(SQLCODE),'찾을 데이타가 둘 이상입니다.','[SP_SL_L_MILGPAY]');
        WHEN  OTHERS  THEN
            ROLLBACK;
            SP_CO_E_ERRCDMSG(ov_errcode,ov_errmsg,'A',SQLERRM(SQLCODE),'DB error','[SP_SL_L_MILGPAY]');

END SP_SL_L_MILGPAY ;