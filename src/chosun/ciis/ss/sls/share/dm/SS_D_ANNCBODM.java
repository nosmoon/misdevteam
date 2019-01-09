/***************************************************************************************************
* ���ϸ� : .java
* ��� : ��������-�ǽð�����-�������� ����
* �ۼ����� : 2009-04-16
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * ��������-�ǽð�����-�������� ����
 */

public class SS_D_ANNCBODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String seq;

	public SS_D_ANNCBODM(){}
	public SS_D_ANNCBODM(String seq){
		this.seq = seq;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_ANNCBO( ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_ANNCBODM dm = (SS_D_ANNCBODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_D_ANNCBODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 16 14:55:56 KST 2009 */