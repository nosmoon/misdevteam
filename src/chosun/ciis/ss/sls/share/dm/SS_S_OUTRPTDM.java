/***************************************************************************************************
* ���ϸ� : SS_S_OUTRPTDM.java
* ��� : �������� ���庸�� ��
* �ۼ����� : 2003-12-24
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


public class SS_S_OUTRPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String makedt;
	public String makepersid;
	public long brwscnt;

	public SS_S_OUTRPTDM(){}
	public SS_S_OUTRPTDM(String makedt, String makepersid, long brwscnt){
		this.makedt = makedt;
		this.makepersid = makepersid;
		this.brwscnt = brwscnt;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setBrwscnt(long brwscnt){
		this.brwscnt = brwscnt;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public long getBrwscnt(){
		return this.brwscnt;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_OUTRPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_OUTRPTDM dm = (SS_S_OUTRPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.makedt);
		cstmt.setString(4, dm.makepersid);
		cstmt.setLong(5, dm.brwscnt);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_S_OUTRPTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String makedt = req.getParameter("makedt");
if( makedt == null){
	System.out.println(this.toString+" : makedt is null" );
}else{
	System.out.println(this.toString+" : makedt is "+makedt );
}
String makepersid = req.getParameter("makepersid");
if( makepersid == null){
	System.out.println(this.toString+" : makepersid is null" );
}else{
	System.out.println(this.toString+" : makepersid is "+makepersid );
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

String makedt = Util.checkString(req.getParameter("makedt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
String brwscnt = Util.checkString(req.getParameter("brwscnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
String brwscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("brwscnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMakedt(makedt);
dm.setMakepersid(makepersid);
dm.setBrwscnt(brwscnt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 24 15:15:50 KST 2003 */