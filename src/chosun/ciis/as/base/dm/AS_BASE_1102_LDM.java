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


package chosun.ciis.as.base.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.base.ds.*;
import chosun.ciis.as.base.rec.*;

/**
 * 
 */


public class AS_BASE_1102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bund_cd;
	public String bund_nm;

	public AS_BASE_1102_LDM(){}
	public AS_BASE_1102_LDM(String cmpy_cd, String bund_cd, String bund_nm){
		this.cmpy_cd = cmpy_cd;
		this.bund_cd = bund_cd;
		this.bund_nm = bund_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBund_cd(String bund_cd){
		this.bund_cd = bund_cd;
	}

	public void setBund_nm(String bund_nm){
		this.bund_nm = bund_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBund_cd(){
		return this.bund_cd;
	}

	public String getBund_nm(){
		return this.bund_nm;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_BASE_1102_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_BASE_1102_LDM dm = (AS_BASE_1102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bund_cd);
		cstmt.setString(5, dm.bund_nm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.base.ds.AS_BASE_1102_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bund_cd = " + getBund_cd());
        System.out.println("bund_nm = " + getBund_nm());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bund_cd = req.getParameter("bund_cd");
if( bund_cd == null){
	System.out.println(this.toString+" : bund_cd is null" );
}else{
	System.out.println(this.toString+" : bund_cd is "+bund_cd );
}
String bund_nm = req.getParameter("bund_nm");
if( bund_nm == null){
	System.out.println(this.toString+" : bund_nm is null" );
}else{
	System.out.println(this.toString+" : bund_nm is "+bund_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bund_cd = Util.checkString(req.getParameter("bund_cd"));
String bund_nm = Util.checkString(req.getParameter("bund_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bund_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bund_cd")));
String bund_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bund_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBund_cd(bund_cd);
dm.setBund_nm(bund_nm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 24 19:50:40 KST 2009 */