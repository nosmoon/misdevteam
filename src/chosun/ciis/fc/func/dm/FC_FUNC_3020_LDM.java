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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_3020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyy;
	public String base_amt;

	public FC_FUNC_3020_LDM(){}
	public FC_FUNC_3020_LDM(String cmpy_cd, String yyyy, String base_amt){
		this.cmpy_cd = cmpy_cd;
		this.yyyy = yyyy;
		this.base_amt = base_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setBase_amt(String base_amt){
		this.base_amt = base_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getBase_amt(){
		return this.base_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_3020_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_3020_LDM dm = (FC_FUNC_3020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyy);
		cstmt.setString(5, dm.base_amt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_3020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyy = [" + getYyyy() + "]");
		System.out.println("base_amt = [" + getBase_amt() + "]");
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
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String base_amt = req.getParameter("base_amt");
if( base_amt == null){
	System.out.println(this.toString+" : base_amt is null" );
}else{
	System.out.println(this.toString+" : base_amt is "+base_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String base_amt = Util.checkString(req.getParameter("base_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String base_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyy(yyyy);
dm.setBase_amt(base_amt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 02 10:49:23 KST 2009 */