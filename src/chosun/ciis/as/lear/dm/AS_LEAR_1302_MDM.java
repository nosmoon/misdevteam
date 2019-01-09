/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.as.lear.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.ds.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 
 */


public class AS_LEAR_1302_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basi_yy;
	public String basi_qq;

	public AS_LEAR_1302_MDM(){}
	public AS_LEAR_1302_MDM(String basi_yy, String basi_qq){
		this.basi_yy = basi_yy;
		this.basi_qq = basi_qq;
	}

	public void setBasi_yy(String basi_yy){
		this.basi_yy = basi_yy;
	}

	public void setBasi_qq(String basi_qq){
		this.basi_qq = basi_qq;
	}

	public String getBasi_yy(){
		return this.basi_yy;
	}

	public String getBasi_qq(){
		return this.basi_qq;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAR_1302_M(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAR_1302_MDM dm = (AS_LEAR_1302_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basi_yy);
		cstmt.setString(4, dm.basi_qq);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.lear.ds.AS_LEAR_1302_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("basi_yy = [" + getBasi_yy() + "]");
		System.out.println("basi_qq = [" + getBasi_qq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String basi_yy = req.getParameter("basi_yy");
if( basi_yy == null){
	System.out.println(this.toString+" : basi_yy is null" );
}else{
	System.out.println(this.toString+" : basi_yy is "+basi_yy );
}
String basi_qq = req.getParameter("basi_qq");
if( basi_qq == null){
	System.out.println(this.toString+" : basi_qq is null" );
}else{
	System.out.println(this.toString+" : basi_qq is "+basi_qq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String basi_yy = Util.checkString(req.getParameter("basi_yy"));
String basi_qq = Util.checkString(req.getParameter("basi_qq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String basi_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yy")));
String basi_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_qq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBasi_yy(basi_yy);
dm.setBasi_qq(basi_qq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 04 11:27:12 KST 2009 */