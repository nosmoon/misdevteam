/***************************************************************************************************
* ���ϸ� : SS_D_DAWNRPTDM.java
* ��� : �������� �����ٹ�����
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


public class SS_D_DAWNRPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String makedt;
	public String makepersid;

	public SS_D_DAWNRPTDM(){}
	public SS_D_DAWNRPTDM(String makedt, String makepersid){
		this.makedt = makedt;
		this.makepersid = makepersid;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_DAWNRPT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_DAWNRPTDM dm = (SS_D_DAWNRPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.makedt);
		cstmt.setString(4, dm.makepersid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_D_DAWNRPTDataSet();
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String makedt = Util.checkString(req.getParameter("makedt"));
String makepersid = Util.checkString(req.getParameter("makepersid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersid = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMakedt(makedt);
dm.setMakepersid(makepersid);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 26 19:43:36 KST 2003 */