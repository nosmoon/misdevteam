PROCEDURE SP_SL_L_MILGPAY (
         ov_errcode          OUT    VARCHAR2    -- ERROR CODE
        ,ov_errmsg           OUT    VARCHAR2    -- ERROR MESSAGE
        ,iv_rdr_no           IN     VARCHAR2    -- ���ڹ�ȣ
        ,iv_frpaydt          IN     VARCHAR2    -- from ��������
        ,iv_topaydt          IN     VARCHAR2    -- to   ��������
        ,iv_paybasicd        IN     VARCHAR2    -- ���ޱ����ڵ�
        ,iv_medicd           IN     VARCHAR2    -- ��ü�ڵ�
        ,iv_pageno           IN     NUMBER      -- ����������
        ,iv_pagesize         IN     NUMBER      -- �������� ������ �Ǽ�
        ,ov_totalcnt         OUT    NUMBER      -- �ѰǼ�
        ,ov_paycur           OUT    PG_CO_REFCUR.COMMONCUR  -- ���޳�������Ʈ(RESULT SET )]
)
AS
/*=================================================================================================
&& CURSORINFO ov_paycur RDR_NO VARCHAR2 MILGPAYDT VARCHAR2 MILGPAYNO VARCHAR2 MEDINM VARCHAR2 PAYBASINM VARCHAR2 PONT NUMBER HDQTALLMAMT NUMBER BOALLMAMT NUMBER BONM VARCHAR2 MARGAMYN VARCHAR2 RNUM NUMBER &&
=================================================================================================*/
/*=================================================================================================
-- SP    �� : SP_SL_L_MILGPAY
-- �ý��۸� : �Ǹ�����
-- �� �� �� : �Ǹ����� ����-���ϸ������޳���
-- �� �� �� : ���ں� ���ϸ������޳��� ����Ʈ
-- �� �� �� : 2004-06-03
-- �� �� �� : �迵��

-- ��� ���̺�
--   SELECT : TACOD_MILGPAY	���ϸ������޳���
--   INSERT :
--   UPDATE :
--   DELETE :

-- Ư����� :
=================================================================================================*/
/*=================================================================================================
-- �� �� �� :
-- �� �� �� :
-- �������� :
=================================================================================================*/
    --����� ���� ����
    USER_EXCEPTION  EXCEPTION;                      --����� EXCEPTION ����
    rv_expcode      VARCHAR2(50)   :=  '';          --����� �����ڵ�
    rv_expmsg       VARCHAR2(500)   :=  '';         --����� �����޼���
    rv_outersql     VARCHAR2(4000)  :=  '';         --���� Query ����
    rv_strsql       VARCHAR2(4000)  :=  '';         --CURSOR�� ���� Query ����
    rv_strwhere     VARCHAR2(1000)  :=  '';         --CURSOR�� ���� Query ����
    rv_cntsql       VARCHAR2(10000)  :=  '';        --�ѰǼ� Query ����
    rv_startno      NUMBER := 0;                    --���۷��ڵ� �ѹ�
    rv_endno        NUMBER := 0;                    --�����ڵ� �ѹ�

	rv_milgmagamdt   VARCHAR2(8)        :=  SF_SL_FIND_LAST_MILGMAGAMDT();        --���ϸ��� �д�� ������������
BEGIN

    rv_startno := (iv_pageno - 1) * iv_pagesize + 1;
    rv_endno := iv_pageno * iv_pagesize;

	rv_strsql :=  '	SELECT  '
				||'			 RDR_NO		'											 -- ���ڹ�ȣ
				||'			,MILGPAYDT	'											 -- ���ϸ�����������
				||'			,MILGPAYNO	'											 -- ���ϸ������޹�ȣ
				||'			,SF_CO_FIND_CICDNM(''96'',''20'',MEDICD) MEDINM 		'-- ��ü��
				||'			,SF_CO_FIND_CICDNM(''97'',''703'',PAYBASICD) PAYBASINM	'-- ���ޱ��ظ�
				||'			,PONT			'										 -- ����Ʈ
				||'			,HDQTALLMAMT	'										 -- ����д��
				||'			,BOALLMAMT		'										 -- ��������д��
				||'			,SF_CO_FIND_BONM(BOCD) BONM	'							 -- ����������
				||'         ,CASE '
				||'				WHEN PAYSTATCD IN (''20'',''30'') OR '''||rv_milgmagamdt||''' >= TO_CHAR(MILGPAYDT) THEN ''Y'' '
				||'				ELSE ''N'' '
				||'			 END AS MARGAMYN	'		    -- ���ϸ��� �д�ݸ��� ����
				||'         ,ROW_NUMBER() OVER(ORDER BY MILGPAYDT DESC, MILGPAYNO DESC) RNUM ' -- row number
				||'   FROM '
				||'  		TACOD_MILGPAY '
				||'  WHERE  RDR_NO = ''' || iv_rdr_no || ''' '
				||'    AND  MILGPAYDT BETWEEN '''|| iv_frpaydt ||''' AND '''||iv_topaydt||''' ';
				
    --���ޱ����ڵ�
    IF iv_paybasicd IS NOT NULL  THEN
		rv_strwhere := 'AND  PAYBASICD = '''||iv_paybasicd||''' ';
	END IF;
	
	--��ü�ڵ�
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
            SP_CO_E_ERRCDMSG(ov_errcode,ov_errmsg,'U',SQLERRM(SQLCODE),'ó���ϰ��� �ϴ� ����Ÿ�� ã�� ���߽��ϴ�.','[SP_SL_L_MILGPAY]');
        WHEN  TOO_MANY_ROWS  THEN
            ROLLBACK;
            SP_CO_E_ERRCDMSG(ov_errcode,ov_errmsg,'U',SQLERRM(SQLCODE),'ã�� ����Ÿ�� �� �̻��Դϴ�.','[SP_SL_L_MILGPAY]');
        WHEN  OTHERS  THEN
            ROLLBACK;
            SP_CO_E_ERRCDMSG(ov_errcode,ov_errmsg,'A',SQLERRM(SQLCODE),'DB error','[SP_SL_L_MILGPAY]');

END SP_SL_L_MILGPAY ;