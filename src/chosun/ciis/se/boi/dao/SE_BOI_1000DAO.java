/***************************************************************************************************
 * 파일명 : SE_BOI_1000DAO.java
 * 기능 :
 * 작성일자 :
 * 작성자 :
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.boi.dao;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 *
 */
public class SE_BOI_1000DAO {

    public SE_BOI_1000_MDataSet se_boi_1000_m(SE_BOI_1000_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1000_MDataSet ds = (SE_BOI_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BOI_1010_LDataSet se_boi_1010_l(SE_BOI_1010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1010_LDataSet ds = (SE_BOI_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BOI_1020_SDataSet se_boi_1020_s(SE_BOI_1020_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1020_SDataSet ds = (SE_BOI_1020_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BOI_1030_SDataSet se_boi_1030_s(SE_BOI_1030_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1030_SDataSet ds = (SE_BOI_1030_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BOI_1040_SDataSet se_boi_1040_s(SE_BOI_1040_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1040_SDataSet ds = (SE_BOI_1040_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BOI_1050_LDataSet se_boi_1050_l(SE_BOI_1050_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1050_LDataSet ds = (SE_BOI_1050_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BOI_1055_LDataSet se_boi_1055_l(SE_BOI_1055_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1055_LDataSet ds = (SE_BOI_1055_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public SE_BOI_1056_LDataSet se_boi_1056_l(SE_BOI_1056_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1056_LDataSet ds = (SE_BOI_1056_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_BOI_1057_LDataSet se_boi_1057_l(SE_BOI_1057_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1057_LDataSet ds = (SE_BOI_1057_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_BOI_1058_SDataSet se_boi_1058_s(SE_BOI_1058_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1058_SDataSet ds = (SE_BOI_1058_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	public SE_BOI_1059_LDataSet se_boi_1059_l(SE_BOI_1059_LDM dm) throws AppException {
		DBManager manager =new DBManager("MISSEL");
		SE_BOI_1059_LDataSet ds = (SE_BOI_1059_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

    public SE_BOI_1060_ADataSet se_boi_1060_a(SE_BOI_1060_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1060_ADataSet ds = (SE_BOI_1060_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public boolean se_boi_1070_a(SE_BOI_1070_ADM dm) throws AppException {

        boolean ret = false;

        if (dm.bo_head_phot != null && dm.phot_size != "0" && !dm.accflag.equals("P")) {

			byte[] tempCont;    	// 임시 첨부파일 내용

			tempCont = dm.bo_head_phot;
			DBManager manager = null;

			try {

				manager = new DBManager("MISSEL");
				manager.getConnection();
				manager.m_conn.setAutoCommit(false);

				CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());

				  // 파라미터 설정
				cstmt.registerOutParameter(1, Types.VARCHAR);
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.setString(3, dm.accflag);
				cstmt.setString(4, dm.cmpy_cd);
				cstmt.setString(5, dm.bo_head_nm);
				cstmt.setString(6, dm.bo_head_prn);
				cstmt.setString(7, dm.tel_no_0);
				cstmt.setString(8, dm.tel_no_1);
				cstmt.setString(9, dm.tel_no_2);
				cstmt.setString(10, dm.tel_no_3);
				cstmt.setString(11, dm.ptph_1);
				cstmt.setString(12, dm.ptph_2);
				cstmt.setString(13, dm.ptph_3);
				cstmt.setString(14, dm.bo_head_bidt);
				cstmt.setString(15, dm.luso_clsf);
				cstmt.setString(16, dm.wedd_anvy_dd);
				cstmt.setString(17, dm.zip_1);
				cstmt.setString(18, dm.zip_2);
				cstmt.setString(19, dm.addr);
				cstmt.setString(20, dm.dtls_addr);
				cstmt.setString(21, dm.nativ);
				cstmt.setString(22, dm.hby);
				cstmt.setString(23, dm.relg);
				cstmt.setString(24, dm.drink_qunt);
				cstmt.setString(25, dm.smok_yn);
				cstmt.setString(26, dm.dlco_no);
				//cstmt.setBytes(26, dm.bo_head_phot);
				cstmt.setBytes(27, "1010".getBytes());
				cstmt.setString(28, dm.phot_size+"");
				cstmt.setString(29, dm.mode_ar);
				cstmt.setString(30, dm.hsty_seq_ar);
				cstmt.setString(31, dm.yymm_ar);
				cstmt.setString(32, dm.hsty_matt_ar);
				cstmt.setString(33, dm.mode2_ar);
				cstmt.setString(34, dm.faml_seq_ar);
				cstmt.setString(35, dm.flnm_ar);
				cstmt.setString(36, dm.faml_rshp_cd_ar);
				cstmt.setString(37, dm.bidt_ar);
				cstmt.setString(38, dm.luso_clsf_ar);
				cstmt.setString(39, dm.mode3_ar);
				cstmt.setString(40, dm.idea_seq_ar);
				cstmt.setString(41, dm.make_pers_nm_ar);
				cstmt.setString(42, dm.idea_ar);
				cstmt.setString(43, dm.incmgpers);
				cstmt.setString(44, dm.incmg_pers_ip);

				// 실행
				cstmt.execute();
				// 결과
				SE_BOI_1070_ADataSet ds = (SE_BOI_1070_ADataSet)dm.createDataSetObject();
				ds.getValues(cstmt);

				if(!"".equals(ds.errcode)){
				  throw new AppException(ds.errcode, ds.errmsg);
				}

				// BLOB 구하기
				Statement stmt = manager.m_conn.createStatement();
				String blobQuery = "SELECT BO_HEAD_PHOT FROM TASEM_BOHEADPHOT WHERE CMPY_CD = '"+dm.cmpy_cd+"' AND BO_HEAD_PRN = '"+dm.bo_head_prn+"' FOR UPDATE";
				OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

				if (rset.next()) {
					//weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
					//BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
          	   		//레진용(ep1)
          	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);

					OutputStream os = oracle_blob.getBinaryOutputStream();

					// 파일로부터 읽어서 BLOB 에 WRITE 한다.
					for(int i=0; i<tempCont.length; i++){
						os.write(tempCont[i]);
					}
					os.close();
				}
				manager.m_conn.commit();
				manager.m_conn.setAutoCommit(true);
				stmt.close();
				manager.disConnection();
			} catch (Exception e) {
				try{
					manager.m_conn.rollback();
				}catch(SQLException se){
					throw new SysException(se);
				}
				manager.disConnection();
				throw new SysException(e);
			}
			ret = true;

        }else{

	        DBManager manager = new DBManager("MISSEL");
	        SE_BOI_1070_ADataSet ds = (SE_BOI_1070_ADataSet) manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }else{
        		ret = true;
	        }

        }

        return ret;
    }

    public SE_BOI_1080_ADataSet se_boi_1080_a(SE_BOI_1080_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1080_ADataSet ds = (SE_BOI_1080_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SE_BOI_1090_ADataSet se_boi_1090_a(SE_BOI_1090_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_BOI_1090_ADataSet ds = (SE_BOI_1090_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public SE_BOI_1091_ADataSet se_boi_1091_a(SE_BOI_1091_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1091_ADataSet ds = (SE_BOI_1091_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	//20170427 장선희
	public SE_BOI_1092_SDataSet se_boi_1092_s(SE_BOI_1092_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1092_SDataSet ds = (SE_BOI_1092_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	//20170518 장선희
	public SE_BOI_1093_LDataSet se_boi_1093_l(SE_BOI_1093_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1093_LDataSet ds = (SE_BOI_1093_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}


}
