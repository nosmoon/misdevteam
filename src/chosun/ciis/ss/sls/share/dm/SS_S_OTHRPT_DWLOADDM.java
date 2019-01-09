/***************************************************************************************************
* ���ϸ� : SS_S_OTHRPT_DWLOADDM.java
* ��� : �������� Ÿ�絿�⺸�� ���ϴٿ�ε�
* �ۼ����� : 2004-01-07
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
 * ��������-Ÿ�絿�⺸�� ���ϴٿ�ε�
 *
 */


public class SS_S_OTHRPT_DWLOADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public long seq;
	public long dwloadcnt;

	public SS_S_OTHRPT_DWLOADDM(){}
	public SS_S_OTHRPT_DWLOADDM(long seq, long dwloadcnt){
		this.seq = seq;
		this.dwloadcnt = dwloadcnt;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setDwloadcnt(long dwloadcnt){
		this.dwloadcnt = dwloadcnt;
	}

	public long getSeq(){
		return this.seq;
	}

	public long getDwloadcnt(){
		return this.dwloadcnt;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_OTHRPT_DWLOAD( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_OTHRPT_DWLOADDM dm = (SS_S_OTHRPT_DWLOADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setLong(3, dm.seq);
		cstmt.setLong(4, dm.dwloadcnt);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.BLOB);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_S_OTHRPT_DWLOADDataSet();
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
String dwloadcnt = req.getParameter("dwloadcnt");
if( dwloadcnt == null){
	System.out.println(this.toString+" : dwloadcnt is null" );
}else{
	System.out.println(this.toString+" : dwloadcnt is "+dwloadcnt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.checkString(req.getParameter("seq"));
String dwloadcnt = Util.checkString(req.getParameter("dwloadcnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dwloadcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("dwloadcnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSeq(seq);
dm.setDwloadcnt(dwloadcnt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 07 22:21:41 KST 2004 */