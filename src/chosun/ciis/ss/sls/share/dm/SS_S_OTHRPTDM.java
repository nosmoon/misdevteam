/***************************************************************************************************
* ���ϸ� : SS_S_OTHRPTDM.java
* ��� : �������� Ÿ�絿�⺸��
* �ۼ����� : 2003-12-26
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * class definition
 *
 */


public class SS_S_OTHRPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public long seq;
	public long brwscnt;

	public SS_S_OTHRPTDM(){}
	public SS_S_OTHRPTDM(long seq, long brwscnt){
		this.seq = seq;
		this.brwscnt = brwscnt;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setBrwscnt(long brwscnt){
		this.brwscnt = brwscnt;
	}

	public long getSeq(){
		return this.seq;
	}

	public long getBrwscnt(){
		return this.brwscnt;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_OTHRPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_OTHRPTDM dm = (SS_S_OTHRPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setLong(3, dm.seq);
		cstmt.setLong(4, dm.brwscnt);
		cstmt.registerOutParameter(5, Types.INTEGER);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_S_OTHRPTDataSet();
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
String brwscnt = req.getParameter("brwscnt");
if( brwscnt == null){
	System.out.println(this.toString+" : brwscnt is null" );
}else{
	System.out.println(this.toString+" : brwscnt is "+brwscnt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.checkString(req.getParameter("seq"));
String brwscnt = Util.checkString(req.getParameter("brwscnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String brwscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("brwscnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSeq(seq);
dm.setBrwscnt(brwscnt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 26 23:04:22 KST 2003 */