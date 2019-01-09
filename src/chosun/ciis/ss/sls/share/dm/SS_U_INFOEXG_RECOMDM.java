/***************************************************************************************************
* ���ϸ� : SS_U_INFOEXG_RECOMDM.java
* ��� : �������� �Խ��� ��õ
* �ۼ����� : 2004-05-20
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
 * �������� �Խ��� ��õ
 *
 */

public class SS_U_INFOEXG_RECOMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public long seq;
	public long recomcnt;
	public String incmgpers;

	public SS_U_INFOEXG_RECOMDM(){}
	public SS_U_INFOEXG_RECOMDM(String clsf, long seq, long recomcnt, String incmgpers){
		this.clsf = clsf;
		this.seq = seq;
		this.recomcnt = recomcnt;
		this.incmgpers = incmgpers;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setRecomcnt(long recomcnt){
		this.recomcnt = recomcnt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getClsf(){
		return this.clsf;
	}

	public long getSeq(){
		return this.seq;
	}

	public long getRecomcnt(){
		return this.recomcnt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_INFOEXG_RECOM( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_INFOEXG_RECOMDM dm = (SS_U_INFOEXG_RECOMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setLong(4, dm.seq);
		cstmt.setLong(5, dm.recomcnt);
		cstmt.setString(6, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_U_INFOEXG_RECOMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String recomcnt = req.getParameter("recomcnt");
if( recomcnt == null){
	System.out.println(this.toString+" : recomcnt is null" );
}else{
	System.out.println(this.toString+" : recomcnt is "+recomcnt );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String clsf = Util.checkString(req.getParameter("clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String recomcnt = Util.checkString(req.getParameter("recomcnt"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String recomcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("recomcnt")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setClsf(clsf);
dm.setSeq(seq);
dm.setRecomcnt(recomcnt);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 21 19:50:01 KST 2004 */