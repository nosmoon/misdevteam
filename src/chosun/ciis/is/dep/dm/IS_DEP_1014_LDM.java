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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1014_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf;
	public String slip_no;

	public IS_DEP_1014_LDM(){}
	public IS_DEP_1014_LDM(String cmpy_cd, String slip_clsf, String slip_no){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf = slip_clsf;
		this.slip_no = slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_1014_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_1014_LDM dm = (IS_DEP_1014_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf);
		cstmt.setString(5, dm.slip_no);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_1014_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf = [" + getSlip_clsf() + "]");
		System.out.println("slip_no = [" + getSlip_no() + "]");
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
String slip_clsf = req.getParameter("slip_clsf");
if( slip_clsf == null){
	System.out.println(this.toString+" : slip_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_clsf is "+slip_clsf );
}
String slip_no = req.getParameter("slip_no");
if( slip_no == null){
	System.out.println(this.toString+" : slip_no is null" );
}else{
	System.out.println(this.toString+" : slip_no is "+slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String slip_no = Util.checkString(req.getParameter("slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf(slip_clsf);
dm.setSlip_no(slip_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 23 19:30:02 KST 2012 */