// ============================================================================
package java_project_8;

import routines.libs;
import routines.routine_tMap_10_persistence_01_types;
import routines.routine_tMap_10_persistence_02_types_sorteddata;
import routines.DataOperation;
import routines.Mathematical;
import routines.Numeric;
import routines.Relational;
import routines.StringHandling;
import routines.TalendDataGenerator;
import routines.TalendDate;
import routines.TalendString;
import routines.system.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;

/**
 * Job: Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk Purpose:
 * <br>
 * Description: Tests the case where an iterate connection with parallel is set
 * before tMap. tMap set with ALL MATCHES join and STORE ON DISK. <br>
 * 
 * @author amaumont@talend.com
 * @version 2.2.0.qualifier
 * @status
 */
public class Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk {
	// create and load default properties
	private static java.util.Properties defaultProps = new java.util.Properties();

	// create application properties with default
	private static class ContextProperties extends java.util.Properties {

		public ContextProperties(java.util.Properties properties) {
			super(properties);
		}

		public ContextProperties() {
			super();
		}

		public static String param_file_path;
		public static String data_dir;
		public static String data_output_dir;
		public static String result_host;
		public static String result_port;
		public static String result_database;
		public static String result_username;
		public static String result_password;
		public static String result_table;
		public static String mysql_host;
		public static String mysql_port;
		public static String mysql_schema;
		public static String mysql_username;
		public static String mysql_password;
		public static String current_job_dir;
	}

	private static ContextProperties context = new ContextProperties();
	private static final String jobName = "Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk";
	private static final String projectName = "JAVA_PROJECT_8";
	public static Integer errorCode = null;
	private static String currentComponent = "";
	private static final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
	private static final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
	private static final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
	private static final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	public static final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();

	private static RunStat runStat = new RunStat();

	AssertCatcherUtils tAssertCatcher_1 = new AssertCatcherUtils();

	private class TalendException extends Exception {
		private Exception e = null;
		private Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk c = null;

		private TalendException(
				Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk c,
				Exception e) {
			this.e = e;
			this.c = c;
		}

		@Override
		public void printStackTrace() {
			if (!(e instanceof TalendException || e instanceof TDieException)) {
				globalMap.put(currentComponent + "_ERROR_MESSAGE", e
						.getMessage());
				System.err
						.println("Exception in component " + currentComponent);
			}
			if (!(e instanceof TDieException)) {
				e.printStackTrace();
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass()
							.getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(c, new Object[] { e });
							break;
						}
					}

					if (!(e instanceof TDieException)) {
					}
				} catch (java.lang.SecurityException e) {
					this.e.printStackTrace();
				} catch (java.lang.IllegalArgumentException e) {
					this.e.printStackTrace();
				} catch (java.lang.IllegalAccessException e) {
					this.e.printStackTrace();
				} catch (java.lang.reflect.InvocationTargetException e) {
					this.e.printStackTrace();
				}
			}
		}
	}

	public void tAssertCatcher_1_error(Exception exception)
			throws TalendException {
		end_Hash.put("tAssertCatcher_1", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tAssertCatcher_1_onSubJobError(exception);
	}

	public void tReplicate_1_error(Exception exception) throws TalendException {
		end_Hash.put("tReplicate_1", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tAssertCatcher_1_onSubJobError(exception);
	}

	public void tMysqlOutput_1_error(Exception exception)
			throws TalendException {
		end_Hash.put("tMysqlOutput_1", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tAssertCatcher_1_onSubJobError(exception);
	}

	public void tLogRow_1_error(Exception exception) throws TalendException {
		end_Hash.put("tLogRow_1", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tAssertCatcher_1_onSubJobError(exception);
	}

	public void tFileInputDelimited_2_error(Exception exception)
			throws TalendException {
		end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileInputDelimited_2_onSubJobError(exception);
	}

	public void tContextLoad_1_error(Exception exception)
			throws TalendException {
		end_Hash.put("tContextLoad_1", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileInputDelimited_2_onSubJobError(exception);
	}

	public void tFileList_2_error(Exception exception) throws TalendException {
		end_Hash.put("tFileList_2", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tFileInputDelimited_8_error(Exception exception)
			throws TalendException {
		end_Hash.put("tFileInputDelimited_8", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tFileOutputDelimited_2_error(Exception exception)
			throws TalendException {
		end_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tFileList_3_error(Exception exception) throws TalendException {
		end_Hash.put("tFileList_3", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_3_onSubJobError(exception);
	}

	public void tFileCompare_1_error(Exception exception)
			throws TalendException {
		end_Hash.put("tFileCompare_1", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_3_onSubJobError(exception);
	}

	public void tAssert_1_error(Exception exception) throws TalendException {
		end_Hash.put("tAssert_1", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_3_onSubJobError(exception);
	}

	public void tFileInputDelimited_5_error(Exception exception)
			throws TalendException {
		end_Hash.put("tFileInputDelimited_5", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tFileInputDelimited_9_error(Exception exception)
			throws TalendException {
		end_Hash.put("tFileInputDelimited_9", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tAdvancedHash_row4_error(Exception exception)
			throws TalendException {
		end_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tAdvancedHash_lookup_error(Exception exception)
			throws TalendException {
		end_Hash.put("tAdvancedHash_lookup", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tMap_4_TMAP_OUT_error(Exception exception)
			throws TalendException {
		end_Hash.put("tMap_4_TMAP_OUT", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tMap_4_TMAP_IN_error(Exception exception)
			throws TalendException {
		end_Hash.put("tMap_4_TMAP_IN", System.currentTimeMillis());
		if (!(exception instanceof TDieException)) {
			tAssertCatcher_1.addMessage(pid, projectName, jobName, "java",
					null, "Failed", "Job execution error", exception
							.getMessage());
			tAssertCatcher_1Process();
		}
		tFileList_2_onSubJobError(exception);
	}

	public void tAssertCatcher_1_onSubJobError(Exception exception)
			throws TalendException {
	}

	public void tFileInputDelimited_2_onSubJobError(Exception exception)
			throws TalendException {
	}

	public void tFileList_2_onSubJobError(Exception exception)
			throws TalendException {
	}

	public void tFileList_3_onSubJobError(Exception exception)
			throws TalendException {
	}

	static class copyOfrow2Struct implements
			routines.system.IPersistableRow<copyOfrow2Struct> {
		static byte[] commonByteArray = new byte[0];

		java.util.Date moment;

		String pid;

		String project;

		String job;

		String language;

		String origin;

		String status;

		String substatus;

		String description;

		public void readData(ObjectInputStream dis) {

			try {

				int length = 0;

				length = dis.readByte();
				if (length == -1) {
					this.moment = null;
				} else {
					this.moment = new Date(dis.readLong());
				}

				length = dis.readInt();
				if (length == -1) {
					this.pid = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.pid = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.project = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.project = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.job = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.job = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.language = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.language = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.origin = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.origin = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.status = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.status = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.substatus = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.substatus = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.description = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.description = new String(commonByteArray, 0, length);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				if (this.moment == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.moment.getTime());
				}

				// String

				if (this.pid == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.pid.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.project == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.project.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.job == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.job.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.language == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.language.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.origin == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.origin.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.status == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.status.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.substatus == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.substatus.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.description == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.description.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("moment");
			sb.append("=");
			sb.append(String.valueOf(this.moment));

			sb.append(", ");

			sb.append("pid");
			sb.append("=");
			sb.append(String.valueOf(this.pid));

			sb.append(", ");

			sb.append("project");
			sb.append("=");
			sb.append(String.valueOf(this.project));

			sb.append(", ");

			sb.append("job");
			sb.append("=");
			sb.append(String.valueOf(this.job));

			sb.append(", ");

			sb.append("language");
			sb.append("=");
			sb.append(String.valueOf(this.language));

			sb.append(", ");

			sb.append("origin");
			sb.append("=");
			sb.append(String.valueOf(this.origin));

			sb.append(", ");

			sb.append("status");
			sb.append("=");
			sb.append(String.valueOf(this.status));

			sb.append(", ");

			sb.append("substatus");
			sb.append("=");
			sb.append(String.valueOf(this.substatus));

			sb.append(", ");

			sb.append("description");
			sb.append("=");
			sb.append(String.valueOf(this.description));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(copyOfrow2Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	static class row3Struct implements
			routines.system.IPersistableRow<row3Struct> {
		static byte[] commonByteArray = new byte[0];

		java.util.Date moment;

		String pid;

		String project;

		String job;

		String language;

		String origin;

		String status;

		String substatus;

		String description;

		public void readData(ObjectInputStream dis) {

			try {

				int length = 0;

				length = dis.readByte();
				if (length == -1) {
					this.moment = null;
				} else {
					this.moment = new Date(dis.readLong());
				}

				length = dis.readInt();
				if (length == -1) {
					this.pid = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.pid = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.project = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.project = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.job = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.job = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.language = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.language = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.origin = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.origin = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.status = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.status = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.substatus = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.substatus = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.description = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.description = new String(commonByteArray, 0, length);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				if (this.moment == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.moment.getTime());
				}

				// String

				if (this.pid == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.pid.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.project == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.project.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.job == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.job.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.language == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.language.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.origin == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.origin.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.status == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.status.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.substatus == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.substatus.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.description == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.description.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("moment");
			sb.append("=");
			sb.append(String.valueOf(this.moment));

			sb.append(", ");

			sb.append("pid");
			sb.append("=");
			sb.append(String.valueOf(this.pid));

			sb.append(", ");

			sb.append("project");
			sb.append("=");
			sb.append(String.valueOf(this.project));

			sb.append(", ");

			sb.append("job");
			sb.append("=");
			sb.append(String.valueOf(this.job));

			sb.append(", ");

			sb.append("language");
			sb.append("=");
			sb.append(String.valueOf(this.language));

			sb.append(", ");

			sb.append("origin");
			sb.append("=");
			sb.append(String.valueOf(this.origin));

			sb.append(", ");

			sb.append("status");
			sb.append("=");
			sb.append(String.valueOf(this.status));

			sb.append(", ");

			sb.append("substatus");
			sb.append("=");
			sb.append(String.valueOf(this.substatus));

			sb.append(", ");

			sb.append("description");
			sb.append("=");
			sb.append(String.valueOf(this.description));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row3Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	static class row1Struct implements
			routines.system.IPersistableRow<row1Struct> {
		static byte[] commonByteArray = new byte[0];

		java.util.Date moment;

		String pid;

		String project;

		String job;

		String language;

		String origin;

		String status;

		String substatus;

		String description;

		public void readData(ObjectInputStream dis) {

			try {

				int length = 0;

				length = dis.readByte();
				if (length == -1) {
					this.moment = null;
				} else {
					this.moment = new Date(dis.readLong());
				}

				length = dis.readInt();
				if (length == -1) {
					this.pid = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.pid = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.project = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.project = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.job = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.job = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.language = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.language = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.origin = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.origin = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.status = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.status = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.substatus = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.substatus = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.description = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.description = new String(commonByteArray, 0, length);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				if (this.moment == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.moment.getTime());
				}

				// String

				if (this.pid == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.pid.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.project == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.project.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.job == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.job.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.language == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.language.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.origin == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.origin.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.status == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.status.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.substatus == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.substatus.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.description == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.description.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("moment");
			sb.append("=");
			sb.append(String.valueOf(this.moment));

			sb.append(", ");

			sb.append("pid");
			sb.append("=");
			sb.append(String.valueOf(this.pid));

			sb.append(", ");

			sb.append("project");
			sb.append("=");
			sb.append(String.valueOf(this.project));

			sb.append(", ");

			sb.append("job");
			sb.append("=");
			sb.append(String.valueOf(this.job));

			sb.append(", ");

			sb.append("language");
			sb.append("=");
			sb.append(String.valueOf(this.language));

			sb.append(", ");

			sb.append("origin");
			sb.append("=");
			sb.append(String.valueOf(this.origin));

			sb.append(", ");

			sb.append("status");
			sb.append("=");
			sb.append(String.valueOf(this.status));

			sb.append(", ");

			sb.append("substatus");
			sb.append("=");
			sb.append(String.valueOf(this.substatus));

			sb.append(", ");

			sb.append("description");
			sb.append("=");
			sb.append(String.valueOf(this.description));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row1Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	public void tAssertCatcher_1Process() throws TalendException {
		globalMap.put("tAssertCatcher_1_SUBPROCESS_STATE", 0);
		try {

			row1Struct row1 = new row1Struct();
			copyOfrow2Struct copyOfrow2 = new copyOfrow2Struct();
			row3Struct row3 = new row3Struct();

			/*******************************************************************
			 * / [tMysqlOutput_1 begin ] start
			 */

			ok_Hash.put("tMysqlOutput_1", false);
			start_Hash.put("tMysqlOutput_1", System.currentTimeMillis());
			currentComponent = "tMysqlOutput_1";

			runStat
					.updateStatOnConnection(
							"copyOfrow2"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 0, 0);

			int nb_line_tMysqlOutput_1 = 0;
			int nb_line_update_tMysqlOutput_1 = 0;
			int nb_line_inserted_tMysqlOutput_1 = 0;
			int nb_line_deleted_tMysqlOutput_1 = 0;

			int deletedCount_tMysqlOutput_1 = 0;
			int updatedCount_tMysqlOutput_1 = 0;
			int insertedCount_tMysqlOutput_1 = 0;

			String tableName_tMysqlOutput_1 = context.result_table;
			boolean whetherReject_tMysqlOutput_1 = false;

			java.util.Calendar calendar_tMysqlOutput_1 = java.util.Calendar
					.getInstance();
			calendar_tMysqlOutput_1.set(1, 0, 1, 0, 0, 0);
			long year1_tMysqlOutput_1 = calendar_tMysqlOutput_1.getTime()
					.getTime();
			calendar_tMysqlOutput_1.set(10000, 0, 1, 0, 0, 0);
			long year10000_tMysqlOutput_1 = calendar_tMysqlOutput_1.getTime()
					.getTime();
			long date_tMysqlOutput_1;

			java.sql.Connection conn_tMysqlOutput_1 = null;
			java.lang.Class.forName("org.gjt.mm.mysql.Driver");

			String url_tMysqlOutput_1 = "jdbc:mysql://" + context.result_host
					+ ":" + context.result_port + "/" + context.result_database
					+ "?" + "noDatetimeStringSync=true";

			String dbUser_tMysqlOutput_1 = context.result_username;
			String dbPwd_tMysqlOutput_1 = context.result_password;
			conn_tMysqlOutput_1 = java.sql.DriverManager.getConnection(
					url_tMysqlOutput_1, dbUser_tMysqlOutput_1,
					dbPwd_tMysqlOutput_1);
			conn_tMysqlOutput_1.setAutoCommit(false);

			java.sql.DatabaseMetaData dbMetaData_tMysqlOutput_1 = conn_tMysqlOutput_1
					.getMetaData();
			java.sql.ResultSet rsTable_tMysqlOutput_1 = dbMetaData_tMysqlOutput_1
					.getTables(null, null, null, new String[] { "TABLE" });
			boolean whetherExist_tMysqlOutput_1 = false;
			while (rsTable_tMysqlOutput_1.next()) {
				String table_tMysqlOutput_1 = rsTable_tMysqlOutput_1
						.getString("TABLE_NAME");
				if (table_tMysqlOutput_1.equalsIgnoreCase(context.result_table)) {
					whetherExist_tMysqlOutput_1 = true;
					break;
				}
			}
			if (!whetherExist_tMysqlOutput_1) {
				java.sql.Statement stmtCreate_tMysqlOutput_1 = conn_tMysqlOutput_1
						.createStatement();
				stmtCreate_tMysqlOutput_1
						.execute("CREATE TABLE `"
								+ tableName_tMysqlOutput_1
								+ "`(`moment` DATETIME ,`pid` VARCHAR(20)  ,`project` VARCHAR(50)  ,`job` VARCHAR(50)  ,`language` VARCHAR(5)  ,`origin` VARCHAR(50)  ,`status` VARCHAR(10)  ,`substatus` VARCHAR(255)  ,`description` VARCHAR(255)  )");
			}
			java.sql.PreparedStatement pstmt_tMysqlOutput_1 = conn_tMysqlOutput_1
					.prepareStatement("INSERT INTO `"
							+ context.result_table
							+ "` (`moment`,`pid`,`project`,`job`,`language`,`origin`,`status`,`substatus`,`description`) VALUES (?,?,?,?,?,?,?,?,?)");

			int commitEvery_tMysqlOutput_1 = 100;

			int commitCounter_tMysqlOutput_1 = 0;

			/**
			 * [tMysqlOutput_1 begin ] stop
			 */

			/*******************************************************************
			 * / [tLogRow_1 begin ] start
			 */

			ok_Hash.put("tLogRow_1", false);
			start_Hash.put("tLogRow_1", System.currentTimeMillis());
			currentComponent = "tLogRow_1";

			runStat
					.updateStatOnConnection(
							"row3"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 0, 0);

			// /////////////////////

			final String OUTPUT_FIELD_SEPARATOR_tLogRow_1 = "|";
			java.io.PrintStream consoleOut_tLogRow_1 = null;

			int nb_line_tLogRow_1 = 0;

			// /////////////////////

			/**
			 * [tLogRow_1 begin ] stop
			 */

			/*******************************************************************
			 * / [tReplicate_1 begin ] start
			 */

			ok_Hash.put("tReplicate_1", false);
			start_Hash.put("tReplicate_1", System.currentTimeMillis());
			currentComponent = "tReplicate_1";

			runStat
					.updateStatOnConnection(
							"row1"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 0, 0);

			/**
			 * [tReplicate_1 begin ] stop
			 */

			/*******************************************************************
			 * / [tAssertCatcher_1 begin ] start
			 */

			ok_Hash.put("tAssertCatcher_1", false);
			start_Hash.put("tAssertCatcher_1", System.currentTimeMillis());
			currentComponent = "tAssertCatcher_1";

			for (AssertCatcherUtils.AssertCatcherMessage acm : tAssertCatcher_1
					.getMessages()) {
				row1.moment = acm.getMoment();
				row1.pid = acm.getPid();
				row1.project = acm.getProject();
				row1.job = acm.getJob();
				row1.language = acm.getLanguage();

				row1.origin = (acm.getOrigin() == null
						|| acm.getOrigin().length() < 1 ? null : acm
						.getOrigin());

				row1.status = acm.getStatus();
				row1.substatus = acm.getSubstatus();
				row1.description = acm.getDescription();

				/**
				 * [tAssertCatcher_1 begin ] stop
				 */
				/***************************************************************
				 * / [tAssertCatcher_1 main ] start
				 */

				currentComponent = "tAssertCatcher_1";

				/**
				 * [tAssertCatcher_1 main ] stop
				 */
				/***************************************************************
				 * / [tReplicate_1 main ] start
				 */

				currentComponent = "tReplicate_1";

				// row1
				// row1

				runStat
						.updateStatOnConnection(
								"row1"
										+ (globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID"))
												: ""), 1, 1);

				copyOfrow2 = new copyOfrow2Struct();

				copyOfrow2.moment = row1.moment;
				copyOfrow2.pid = row1.pid;
				copyOfrow2.project = row1.project;
				copyOfrow2.job = row1.job;
				copyOfrow2.language = row1.language;
				copyOfrow2.origin = row1.origin;
				copyOfrow2.status = row1.status;
				copyOfrow2.substatus = row1.substatus;
				copyOfrow2.description = row1.description;
				row3 = new row3Struct();

				row3.moment = row1.moment;
				row3.pid = row1.pid;
				row3.project = row1.project;
				row3.job = row1.job;
				row3.language = row1.language;
				row3.origin = row1.origin;
				row3.status = row1.status;
				row3.substatus = row1.substatus;
				row3.description = row1.description;

				/**
				 * [tReplicate_1 main ] stop
				 */
				/***************************************************************
				 * / [tMysqlOutput_1 main ] start
				 */

				currentComponent = "tMysqlOutput_1";

				// copyOfrow2
				// copyOfrow2

				runStat
						.updateStatOnConnection(
								"copyOfrow2"
										+ (globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID"))
												: ""), 1, 1);

				whetherReject_tMysqlOutput_1 = false;
				if (copyOfrow2.moment != null) {
					date_tMysqlOutput_1 = copyOfrow2.moment.getTime();
					if (date_tMysqlOutput_1 < year1_tMysqlOutput_1
							|| date_tMysqlOutput_1 >= year10000_tMysqlOutput_1) {
						pstmt_tMysqlOutput_1
								.setString(1, "0000-00-00 00:00:00");
					} else {
						pstmt_tMysqlOutput_1.setTimestamp(1,
								new java.sql.Timestamp(date_tMysqlOutput_1));
					}
				} else {
					pstmt_tMysqlOutput_1.setNull(1, java.sql.Types.DATE);
				}

				if (copyOfrow2.pid == null) {
					pstmt_tMysqlOutput_1.setNull(2, java.sql.Types.VARCHAR);
				} else {
					pstmt_tMysqlOutput_1.setString(2, copyOfrow2.pid);
				}

				if (copyOfrow2.project == null) {
					pstmt_tMysqlOutput_1.setNull(3, java.sql.Types.VARCHAR);
				} else {
					pstmt_tMysqlOutput_1.setString(3, copyOfrow2.project);
				}

				if (copyOfrow2.job == null) {
					pstmt_tMysqlOutput_1.setNull(4, java.sql.Types.VARCHAR);
				} else {
					pstmt_tMysqlOutput_1.setString(4, copyOfrow2.job);
				}

				if (copyOfrow2.language == null) {
					pstmt_tMysqlOutput_1.setNull(5, java.sql.Types.VARCHAR);
				} else {
					pstmt_tMysqlOutput_1.setString(5, copyOfrow2.language);
				}

				if (copyOfrow2.origin == null) {
					pstmt_tMysqlOutput_1.setNull(6, java.sql.Types.VARCHAR);
				} else {
					pstmt_tMysqlOutput_1.setString(6, copyOfrow2.origin);
				}

				if (copyOfrow2.status == null) {
					pstmt_tMysqlOutput_1.setNull(7, java.sql.Types.VARCHAR);
				} else {
					pstmt_tMysqlOutput_1.setString(7, copyOfrow2.status);
				}

				if (copyOfrow2.substatus == null) {
					pstmt_tMysqlOutput_1.setNull(8, java.sql.Types.VARCHAR);
				} else {
					pstmt_tMysqlOutput_1.setString(8, copyOfrow2.substatus);
				}

				if (copyOfrow2.description == null) {
					pstmt_tMysqlOutput_1.setNull(9, java.sql.Types.VARCHAR);
				} else {
					pstmt_tMysqlOutput_1.setString(9, copyOfrow2.description);
				}

				try {
					insertedCount_tMysqlOutput_1 = insertedCount_tMysqlOutput_1
							+ pstmt_tMysqlOutput_1.executeUpdate();
					nb_line_tMysqlOutput_1++;
				} catch (Exception e) {
					whetherReject_tMysqlOutput_1 = true;
					throw (e);
				}
				commitCounter_tMysqlOutput_1++;

				if (commitEvery_tMysqlOutput_1 <= commitCounter_tMysqlOutput_1) {

					conn_tMysqlOutput_1.commit();

					commitCounter_tMysqlOutput_1 = 0;

				}

				/**
				 * [tMysqlOutput_1 main ] stop
				 */

				/***************************************************************
				 * / [tLogRow_1 main ] start
				 */

				currentComponent = "tLogRow_1";

				// row3
				// row3

				runStat
						.updateStatOnConnection(
								"row3"
										+ (globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID"))
												: ""), 1, 1);

				// /////////////////////

				StringBuilder strBuffer_tLogRow_1 = new StringBuilder();

				if (row3.moment != null) { //              

					strBuffer_tLogRow_1.append(FormatterUtils.format_Date(
							row3.moment, "yyyy-MM-dd HH:mm:ss"));

				} //  			

				strBuffer_tLogRow_1.append("|");

				if (row3.pid != null) { //              

					strBuffer_tLogRow_1.append(String.valueOf(row3.pid));

				} //  			

				strBuffer_tLogRow_1.append("|");

				if (row3.project != null) { //              

					strBuffer_tLogRow_1.append(String.valueOf(row3.project));

				} //  			

				strBuffer_tLogRow_1.append("|");

				if (row3.job != null) { //              

					strBuffer_tLogRow_1.append(String.valueOf(row3.job));

				} //  			

				strBuffer_tLogRow_1.append("|");

				if (row3.language != null) { //              

					strBuffer_tLogRow_1.append(String.valueOf(row3.language));

				} //  			

				strBuffer_tLogRow_1.append("|");

				if (row3.origin != null) { //              

					strBuffer_tLogRow_1.append(String.valueOf(row3.origin));

				} //  			

				strBuffer_tLogRow_1.append("|");

				if (row3.status != null) { //              

					strBuffer_tLogRow_1.append(String.valueOf(row3.status));

				} //  			

				strBuffer_tLogRow_1.append("|");

				if (row3.substatus != null) { //              

					strBuffer_tLogRow_1.append(String.valueOf(row3.substatus));

				} //  			

				strBuffer_tLogRow_1.append("|");

				if (row3.description != null) { //              

					strBuffer_tLogRow_1
							.append(String.valueOf(row3.description));

				} //  			

				if (globalMap.get("tLogRow_CONSOLE") != null) {
					consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap
							.get("tLogRow_CONSOLE");
				} else {
					consoleOut_tLogRow_1 = new java.io.PrintStream(
							new java.io.BufferedOutputStream(System.out));
					globalMap.put("tLogRow_CONSOLE", consoleOut_tLogRow_1);
				}

				consoleOut_tLogRow_1.println(strBuffer_tLogRow_1.toString());
				consoleOut_tLogRow_1.flush();
				nb_line_tLogRow_1++;
				// ////

				// ////

				// /////////////////////

				/**
				 * [tLogRow_1 main ] stop
				 */

				/***************************************************************
				 * / [tAssertCatcher_1 end ] start
				 */

				currentComponent = "tAssertCatcher_1";

			}
			runStat
					.updateStatOnConnection(
							"row1"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 2, 0);

			ok_Hash.put("tAssertCatcher_1", true);
			end_Hash.put("tAssertCatcher_1", System.currentTimeMillis());

			/**
			 * [tAssertCatcher_1 end ] stop
			 */
			/*******************************************************************
			 * / [tReplicate_1 end ] start
			 */

			currentComponent = "tReplicate_1";

			runStat
					.updateStatOnConnection(
							"copyOfrow2"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 2, 0);
			runStat
					.updateStatOnConnection(
							"row3"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 2, 0);

			ok_Hash.put("tReplicate_1", true);
			end_Hash.put("tReplicate_1", System.currentTimeMillis());

			/**
			 * [tReplicate_1 end ] stop
			 */
			/*******************************************************************
			 * / [tMysqlOutput_1 end ] start
			 */

			currentComponent = "tMysqlOutput_1";

			if (pstmt_tMysqlOutput_1 != null) {

				pstmt_tMysqlOutput_1.close();

			}

			conn_tMysqlOutput_1.commit();

			conn_tMysqlOutput_1.close();

			nb_line_deleted_tMysqlOutput_1 = nb_line_deleted_tMysqlOutput_1
					+ deletedCount_tMysqlOutput_1;
			nb_line_update_tMysqlOutput_1 = nb_line_update_tMysqlOutput_1
					+ updatedCount_tMysqlOutput_1;
			nb_line_inserted_tMysqlOutput_1 = nb_line_inserted_tMysqlOutput_1
					+ insertedCount_tMysqlOutput_1;

			globalMap.put("tMysqlOutput_1_NB_LINE", nb_line_tMysqlOutput_1);
			globalMap.put("tMysqlOutput_1_NB_LINE_UPDATED",
					nb_line_update_tMysqlOutput_1);
			globalMap.put("tMysqlOutput_1_NB_LINE_INSERTED",
					nb_line_inserted_tMysqlOutput_1);
			globalMap.put("tMysqlOutput_1_NB_LINE_DELETED",
					nb_line_deleted_tMysqlOutput_1);

			ok_Hash.put("tMysqlOutput_1", true);
			end_Hash.put("tMysqlOutput_1", System.currentTimeMillis());

			/**
			 * [tMysqlOutput_1 end ] stop
			 */

			/*******************************************************************
			 * / [tLogRow_1 end ] start
			 */

			currentComponent = "tLogRow_1";

			// ////
			// ////
			globalMap.put("tLogRow_1_NB_LINE", nb_line_tLogRow_1);

			// /////////////////////

			ok_Hash.put("tLogRow_1", true);
			end_Hash.put("tLogRow_1", System.currentTimeMillis());

			/**
			 * [tLogRow_1 end ] stop
			 */

		} catch (Exception e) {

			throw new TalendException(this, e);
		}

		globalMap.put("tAssertCatcher_1_SUBPROCESS_STATE", 1);
	}

	static class row6Struct implements
			routines.system.IPersistableRow<row6Struct> {
		static byte[] commonByteArray = new byte[0];

		String key;

		String value;

		public void readData(ObjectInputStream dis) {

			try {

				int length = 0;

				length = dis.readInt();
				if (length == -1) {
					this.key = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.key = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.value = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.value = new String(commonByteArray, 0, length);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				if (this.key == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.key.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.value == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.value.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("key");
			sb.append("=");
			sb.append(String.valueOf(this.key));

			sb.append(", ");

			sb.append("value");
			sb.append("=");
			sb.append(String.valueOf(this.value));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row6Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	public void tFileInputDelimited_2Process() throws TalendException {
		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);
		try {

			row6Struct row6 = new row6Struct();

			/*******************************************************************
			 * / [tContextLoad_1 begin ] start
			 */

			ok_Hash.put("tContextLoad_1", false);
			start_Hash.put("tContextLoad_1", System.currentTimeMillis());
			currentComponent = "tContextLoad_1";

			runStat
					.updateStatOnConnection(
							"row6"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 0, 0);
			java.util.List<String> assignList_tContextLoad_1 = new java.util.ArrayList<String>();
			java.util.List<String> newPropertyList_tContextLoad_1 = new java.util.ArrayList<String>();
			java.util.List<String> noAssignList_tContextLoad_1 = new java.util.ArrayList<String>();
			int nb_line_tContextLoad_1 = 0;

			/**
			 * [tContextLoad_1 begin ] stop
			 */

			/*******************************************************************
			 * / [tFileInputDelimited_2 begin ] start
			 */

			ok_Hash.put("tFileInputDelimited_2", false);
			start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
			currentComponent = "tFileInputDelimited_2";

			int nb_line_tFileInputDelimited_2 = 0;
			int footer_tFileInputDelimited_2 = 0;
			int totalLinetFileInputDelimited_2 = 0;
			int limittFileInputDelimited_2 = -1;
			int lastLinetFileInputDelimited_2 = -1;

			com.csvreader.CsvReader csvReadertFileInputDelimited_2 = new com.csvreader.CsvReader(
					new java.io.BufferedReader(new java.io.InputStreamReader(
							new java.io.FileInputStream(/**
														 * Start field
														 * tFileInputDelimited_2:FILENAME
														 */
							context.param_file_path/**
													 * End field
													 * tFileInputDelimited_2:FILENAME
													 */
							), "ISO-8859-15")), ',');

			csvReadertFileInputDelimited_2.setSkipEmptyRecords(true);
			csvReadertFileInputDelimited_2.setTextQualifier('"');

			csvReadertFileInputDelimited_2
					.setEscapeMode(com.csvreader.CsvReader.ESCAPE_MODE_DOUBLED);

			String[] rowtFileInputDelimited_2 = null;

			if (footer_tFileInputDelimited_2 > 0) {

				while (csvReadertFileInputDelimited_2.readRecord()) {
					rowtFileInputDelimited_2 = csvReadertFileInputDelimited_2
							.getValues();
					if (!(rowtFileInputDelimited_2.length == 1 && rowtFileInputDelimited_2[0]
							.equals("\015"))) {// empty line when row separator
												// is '\n'

						totalLinetFileInputDelimited_2++;

					}

				}
				int lastLineTemptFileInputDelimited_2 = totalLinetFileInputDelimited_2
						- footer_tFileInputDelimited_2 < 0 ? 0
						: totalLinetFileInputDelimited_2
								- footer_tFileInputDelimited_2;
				if (lastLinetFileInputDelimited_2 > 0) {
					lastLinetFileInputDelimited_2 = lastLinetFileInputDelimited_2 < lastLineTemptFileInputDelimited_2 ? lastLinetFileInputDelimited_2
							: lastLineTemptFileInputDelimited_2;
				} else {
					lastLinetFileInputDelimited_2 = lastLineTemptFileInputDelimited_2;
				}

				csvReadertFileInputDelimited_2.close();

				csvReadertFileInputDelimited_2 = new com.csvreader.CsvReader(
						new java.io.BufferedReader(
								new java.io.InputStreamReader(
										new java.io.FileInputStream(/**
																	 * Start
																	 * field
																	 * tFileInputDelimited_2:FILENAME
																	 */
										context.param_file_path/**
																 * End field
																 * tFileInputDelimited_2:FILENAME
																 */
										), "ISO-8859-15")), ',');
				csvReadertFileInputDelimited_2.setSkipEmptyRecords(true);
				csvReadertFileInputDelimited_2.setTextQualifier('"');

				csvReadertFileInputDelimited_2
						.setEscapeMode(com.csvreader.CsvReader.ESCAPE_MODE_DOUBLED);

			}

			int currentLinetFileInputDelimited_2 = 0;
			int outputLinetFileInputDelimited_2 = 0;

			while (csvReadertFileInputDelimited_2.readRecord()) {

				rowtFileInputDelimited_2 = csvReadertFileInputDelimited_2
						.getValues();

				if (rowtFileInputDelimited_2.length == 1
						&& rowtFileInputDelimited_2[0].equals("\015")) {// empty
																		// line
																		// when
																		// row
																		// separator
																		// is
																		// '\n'
					continue;
				}

				currentLinetFileInputDelimited_2++;
				if (currentLinetFileInputDelimited_2 < 0 + 1) {
					continue;
				}

				if (lastLinetFileInputDelimited_2 > -1
						&& currentLinetFileInputDelimited_2 > lastLinetFileInputDelimited_2) {
					break;
				}
				outputLinetFileInputDelimited_2++;
				if (limittFileInputDelimited_2 != -1
						&& outputLinetFileInputDelimited_2 > limittFileInputDelimited_2) {
					break;
				}

				row6 = null;
				boolean whetherReject_tFileInputDelimited_2 = false;
				row6 = new row6Struct();
				try {

					if (rowtFileInputDelimited_2.length == 1
							&& rowtFileInputDelimited_2[0].equals("\015")) {// empty
																			// line
																			// when
																			// row
																			// separator
																			// is
																			// '\n'

						row6.key = null;

						row6.value = null;

					} else {

						if (0 < rowtFileInputDelimited_2.length) {
							row6.key = rowtFileInputDelimited_2[0].trim();

						} else {

							row6.key = null;

						}

						if (1 < rowtFileInputDelimited_2.length) {
							row6.value = rowtFileInputDelimited_2[1].trim();

						} else {

							row6.value = null;

						}

					}

				} catch (Exception e) {
					whetherReject_tFileInputDelimited_2 = true;
					throw (e);
				}

				/**
				 * [tFileInputDelimited_2 begin ] stop
				 */
				/***************************************************************
				 * / [tFileInputDelimited_2 main ] start
				 */

				currentComponent = "tFileInputDelimited_2";

				/**
				 * [tFileInputDelimited_2 main ] stop
				 */
				// Start of branch "row6"
				if (row6 != null) {

					/***********************************************************
					 * / [tContextLoad_1 main ] start
					 */

					currentComponent = "tContextLoad_1";

					// row6
					// row6

					runStat
							.updateStatOnConnection(
									"row6"
											+ (globalMap
													.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
													.get("PARALLEL_ITERATOR_THREAD_ID"))
													: ""), 1, 1);

					// ////////////////////////
					String key_tContextLoad_1 = null;
					if (row6.key != null) {
						key_tContextLoad_1 = row6.key;
					}
					String value_tContextLoad_1 = null;
					if (row6.value != null) {
						value_tContextLoad_1 = row6.value;
					}
					if (context.getProperty(key_tContextLoad_1) != null) {
						context.setProperty(key_tContextLoad_1,
								value_tContextLoad_1);

						if (key_tContextLoad_1 != null
								&& "param_file_path".equals(key_tContextLoad_1)) {
							context.param_file_path = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "data_dir".equals(key_tContextLoad_1)) {
							context.data_dir = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "data_output_dir".equals(key_tContextLoad_1)) {
							context.data_output_dir = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "result_host".equals(key_tContextLoad_1)) {
							context.result_host = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "result_port".equals(key_tContextLoad_1)) {
							context.result_port = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "result_database".equals(key_tContextLoad_1)) {
							context.result_database = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "result_username".equals(key_tContextLoad_1)) {
							context.result_username = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "result_password".equals(key_tContextLoad_1)) {
							context.result_password = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "result_table".equals(key_tContextLoad_1)) {
							context.result_table = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "mysql_host".equals(key_tContextLoad_1)) {
							context.mysql_host = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "mysql_port".equals(key_tContextLoad_1)) {
							context.mysql_port = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "mysql_schema".equals(key_tContextLoad_1)) {
							context.mysql_schema = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "mysql_username".equals(key_tContextLoad_1)) {
							context.mysql_username = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "mysql_password".equals(key_tContextLoad_1)) {
							context.mysql_password = value_tContextLoad_1;
						}

						if (key_tContextLoad_1 != null
								&& "current_job_dir".equals(key_tContextLoad_1)) {
							context.current_job_dir = value_tContextLoad_1;
						}

						assignList_tContextLoad_1.add(key_tContextLoad_1);
					} else {
						context.setProperty(key_tContextLoad_1,
								value_tContextLoad_1);

						if (key_tContextLoad_1 != null
								&& "param_file_path".equals(key_tContextLoad_1)) {
							context.param_file_path = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "data_dir".equals(key_tContextLoad_1)) {
							context.data_dir = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "data_output_dir".equals(key_tContextLoad_1)) {
							context.data_output_dir = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "result_host".equals(key_tContextLoad_1)) {
							context.result_host = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "result_port".equals(key_tContextLoad_1)) {
							context.result_port = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "result_database".equals(key_tContextLoad_1)) {
							context.result_database = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "result_username".equals(key_tContextLoad_1)) {
							context.result_username = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "result_password".equals(key_tContextLoad_1)) {
							context.result_password = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "result_table".equals(key_tContextLoad_1)) {
							context.result_table = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "mysql_host".equals(key_tContextLoad_1)) {
							context.mysql_host = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "mysql_port".equals(key_tContextLoad_1)) {
							context.mysql_port = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "mysql_schema".equals(key_tContextLoad_1)) {
							context.mysql_schema = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "mysql_username".equals(key_tContextLoad_1)) {
							context.mysql_username = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "mysql_password".equals(key_tContextLoad_1)) {
							context.mysql_password = value_tContextLoad_1;

						}

						if (key_tContextLoad_1 != null
								&& "current_job_dir".equals(key_tContextLoad_1)) {
							context.current_job_dir = value_tContextLoad_1;

						}

						newPropertyList_tContextLoad_1.add(key_tContextLoad_1);
					}
					nb_line_tContextLoad_1++;
					// ////////////////////////

					/**
					 * [tContextLoad_1 main ] stop
					 */

				} // End of branch "row6"

				/***************************************************************
				 * / [tFileInputDelimited_2 end ] start
				 */

				currentComponent = "tFileInputDelimited_2";

				nb_line_tFileInputDelimited_2++;
			}
			csvReadertFileInputDelimited_2.close();
			globalMap.put("tFileInputDelimited_2_NB_LINE",
					nb_line_tFileInputDelimited_2);
			runStat
					.updateStatOnConnection(
							"row6"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 2, 0);

			ok_Hash.put("tFileInputDelimited_2", true);
			end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());

			/**
			 * [tFileInputDelimited_2 end ] stop
			 */
			/*******************************************************************
			 * / [tContextLoad_1 end ] start
			 */

			currentComponent = "tContextLoad_1";

			java.util.Enumeration<?> enu_tContextLoad_1 = context
					.propertyNames();
			while (enu_tContextLoad_1.hasMoreElements()) {
				String key_tContextLoad_1 = (String) enu_tContextLoad_1
						.nextElement();
				if (!assignList_tContextLoad_1.contains(key_tContextLoad_1)
						&& !newPropertyList_tContextLoad_1
								.contains(key_tContextLoad_1)) {
					noAssignList_tContextLoad_1.add(key_tContextLoad_1);
				}
			}
			globalMap.put("tContextLoad_1_NB_LINE", nb_line_tContextLoad_1);

			ok_Hash.put("tContextLoad_1", true);
			end_Hash.put("tContextLoad_1", System.currentTimeMillis());

			/**
			 * [tContextLoad_1 end ] stop
			 */

			tFileList_2Process();

		} catch (Exception e) {

			throw new TalendException(this, e);
		}

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}

	static class outStruct implements
			routines.system.IPersistableRow<outStruct> {
		static byte[] commonByteArray = new byte[0];

		Integer ID_MAIN;

		String LABEL_MAIN;

		Integer ID_LOOKUP1;

		String LABEL_LOOKUP1;

		int ID_LOOKUP1_1;

		String LABEL_LOOKUP1_1;

		public void readData(ObjectInputStream dis) {

			try {

				int length = 0;

				length = dis.readByte();
				if (length == -1) {
					this.ID_MAIN = null;
				} else {
					this.ID_MAIN = dis.readInt();
				}

				length = dis.readInt();
				if (length == -1) {
					this.LABEL_MAIN = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.LABEL_MAIN = new String(commonByteArray, 0, length);
				}

				length = dis.readByte();
				if (length == -1) {
					this.ID_LOOKUP1 = null;
				} else {
					this.ID_LOOKUP1 = dis.readInt();
				}

				length = dis.readInt();
				if (length == -1) {
					this.LABEL_LOOKUP1 = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.LABEL_LOOKUP1 = new String(commonByteArray, 0, length);
				}

				this.ID_LOOKUP1_1 = dis.readInt();

				length = dis.readInt();
				if (length == -1) {
					this.LABEL_LOOKUP1_1 = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.LABEL_LOOKUP1_1 = new String(commonByteArray, 0,
							length);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				if (this.ID_MAIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeInt(this.ID_MAIN);
				}

				// String

				if (this.LABEL_MAIN == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.LABEL_MAIN.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// Integer

				if (this.ID_LOOKUP1 == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeInt(this.ID_LOOKUP1);
				}

				// String

				if (this.LABEL_LOOKUP1 == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.LABEL_LOOKUP1.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// int

				dos.writeInt(this.ID_LOOKUP1_1);

				// String

				if (this.LABEL_LOOKUP1_1 == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.LABEL_LOOKUP1_1.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("ID_MAIN");
			sb.append("=");
			sb.append(String.valueOf(this.ID_MAIN));

			sb.append(", ");

			sb.append("LABEL_MAIN");
			sb.append("=");
			sb.append(String.valueOf(this.LABEL_MAIN));

			sb.append(", ");

			sb.append("ID_LOOKUP1");
			sb.append("=");
			sb.append(String.valueOf(this.ID_LOOKUP1));

			sb.append(", ");

			sb.append("LABEL_LOOKUP1");
			sb.append("=");
			sb.append(String.valueOf(this.LABEL_LOOKUP1));

			sb.append(", ");

			sb.append("ID_LOOKUP1_1");
			sb.append("=");
			sb.append(String.valueOf(this.ID_LOOKUP1_1));

			sb.append(", ");

			sb.append("LABEL_LOOKUP1_1");
			sb.append("=");
			sb.append(String.valueOf(this.LABEL_LOOKUP1_1));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(outStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	static class mainStruct implements
			routines.system.IPersistableRow<mainStruct> {
		static byte[] commonByteArray = new byte[0];

		Integer ID_MAIN;

		String LABEL_MAIN;

		public void readData(ObjectInputStream dis) {

			try {

				int length = 0;

				length = dis.readByte();
				if (length == -1) {
					this.ID_MAIN = null;
				} else {
					this.ID_MAIN = dis.readInt();
				}

				length = dis.readInt();
				if (length == -1) {
					this.LABEL_MAIN = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.LABEL_MAIN = new String(commonByteArray, 0, length);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Integer

				if (this.ID_MAIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeInt(this.ID_MAIN);
				}

				// String

				if (this.LABEL_MAIN == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.LABEL_MAIN.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("ID_MAIN");
			sb.append("=");
			sb.append(String.valueOf(this.ID_MAIN));

			sb.append(", ");

			sb.append("LABEL_MAIN");
			sb.append("=");
			sb.append(String.valueOf(this.LABEL_MAIN));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(mainStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	static class after_tFileList_2Struct implements
			routines.system.IPersistableRow<after_tFileList_2Struct> {
		static byte[] commonByteArray = new byte[0];

		public void readData(ObjectInputStream dis) {

			try {

				int length = 0;

			}

			finally {
			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

			}

			finally {
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(after_tFileList_2Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	public void tFileList_2Process() throws TalendException {
		globalMap.put("tFileList_2_SUBPROCESS_STATE", 0);
		try {
			tFileInputDelimited_5Process();
			tFileInputDelimited_9Process();

			mainStruct main = new mainStruct();
			outStruct out = new outStruct();
			/*******************************************************************
			 * / [tFileList_2 begin ] start
			 */

			TalendThreadPool mtp_tFileList_2 = new TalendThreadPool(2);
			final Object[] lockWrite = new Object[0];
			int threadIdCounter = 0;

			ok_Hash.put("tFileList_2", false);
			start_Hash.put("tFileList_2", System.currentTimeMillis());
			currentComponent = "tFileList_2";

			// tFileList_Begin

			String directory_tFileList_2 = context.getProperty("data_dir")
					+ context.getProperty("current_job_dir") + "in";
			String filemask_tFileList_2 = "main_*.csv" + "$";
			if (filemask_tFileList_2.indexOf("^") == -1)
				filemask_tFileList_2 = "^" + filemask_tFileList_2;
			filemask_tFileList_2 = java.util.regex.Pattern.compile("[*]")
					.matcher(filemask_tFileList_2).replaceAll(".*");

			boolean case_sensitive_tFileList_2 = true;
			java.util.regex.Pattern fileNamePattern_tFileList_2 = java.util.regex.Pattern
					.compile(filemask_tFileList_2);
			if (!case_sensitive_tFileList_2) {
				fileNamePattern_tFileList_2 = java.util.regex.Pattern.compile(
						filemask_tFileList_2,
						java.util.regex.Pattern.CASE_INSENSITIVE);
			}
			java.io.File file_tFileList_2 = new java.io.File(
					directory_tFileList_2);
			final java.util.List<java.io.File> list_tFileList_2 = new java.util.ArrayList<java.io.File>();
			file_tFileList_2.listFiles(new java.io.FilenameFilter() {
				public boolean accept(java.io.File dir, String name) {
					java.io.File file = new java.io.File(dir, name);
					if (!file.isDirectory()) {
						list_tFileList_2.add(file);
					}
					return true;
				}
			});
			int NB_FILEtFileList_2 = 0;
			for (int i_tFileList_2 = 0; i_tFileList_2 < list_tFileList_2.size(); i_tFileList_2++) {

				java.io.File files_tFileList_2 = list_tFileList_2
						.get(i_tFileList_2);
				String fileName_tFileList_2 = files_tFileList_2.getName();
				if (!fileNamePattern_tFileList_2.matcher(fileName_tFileList_2)
						.find()) {
					continue;
				}

				String currentFileName_tFileList_2 = files_tFileList_2
						.getName();
				String currentFilePath_tFileList_2 = files_tFileList_2
						.getAbsolutePath();
				NB_FILEtFileList_2++;

				globalMap.put("tFileList_2_CURRENT_FILE",
						currentFileName_tFileList_2);
				globalMap.put("tFileList_2_CURRENT_FILEPATH",
						currentFilePath_tFileList_2);

				class tFileList_2Thread extends Thread {// implements
														// routines.system.TalendThreadPool.PropertySettable
					class ThreadedMap extends java.util.HashMap<String, Object> {
						java.util.Map<String, Object> myMap = new java.util.HashMap<String, Object>();
						private static final long serialVersionUID = 0L;

						public ThreadedMap(
								java.util.Map<String, Object> globalMap) {
							for (String s : globalMap.keySet()) {
								myMap.put(s, globalMap.get(s));
							}
						}

						@Override
						public Object get(Object key) {
							return myMap.get(key);
						}

						@Override
						public Object put(String key, Object value) {
							myMap.put(key, value);
							return Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk.globalMap
									.put(key, value);
						}
					}

					ThreadedMap globalMap = null;
					boolean isRunning = false;

					mainStruct main = new mainStruct();
					outStruct out = new outStruct();

					public tFileList_2Thread(
							java.util.Map<String, Object> globalMap,
							mainStruct main, outStruct out, int threadID) {
						super();

						this.main = main;

						this.out = out;

						this.globalMap = new ThreadedMap(globalMap);
						this.globalMap.myMap.put("PARALLEL_ITERATOR_THREAD_ID",
								Integer.toString(threadID));
					}

					public void run() {
						this.isRunning = true;
						try {
							String currentComponent = "";
							runStat
									.updateStatOnConnection(
											"iterate1",
											0,
											"exec"
													+ (String) globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID"));

							/**
							 * [tFileList_2 begin ] stop
							 */
							/***************************************************
							 * / [tFileList_2 main ] start
							 */

							currentComponent = "tFileList_2";

							/**
							 * [tFileList_2 main ] stop
							 */

							/***************************************************
							 * / [tMap_4_TMAP_OUT begin ] start
							 */

							ok_Hash.put("tMap_4_TMAP_OUT", false);
							start_Hash.put("tMap_4_TMAP_OUT", System
									.currentTimeMillis());
							currentComponent = "tMap_4_TMAP_OUT";

							runStat
									.updateStatOnConnection(
											"main"
													+ (globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID"))
															: ""), 0, 0);

							// ###############################
							// # Lookup's keys initialization

							Integer currentThreadNumber_tMap_4 = null;
							synchronized (Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk.globalMap) {

								currentThreadNumber_tMap_4 = (Integer) Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk.globalMap
										.get("currentThreadNumber_tMap_4");

								if (currentThreadNumber_tMap_4 == null) {
									currentThreadNumber_tMap_4 = 1;
								} else {
									currentThreadNumber_tMap_4++;
								}
								Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk.globalMap
										.put("currentThreadNumber_tMap_4",
												currentThreadNumber_tMap_4);

							}

							org.talend.designer.components.persistent.PersistentSortedLookupManager<lookupStruct> tHash_Lookup_lookup = (org.talend.designer.components.persistent.PersistentSortedLookupManager<lookupStruct>) ((org.talend.designer.components.persistent.PersistentSortedLookupManager<lookupStruct>) globalMap
									.get("tHash_Lookup_lookup"))

							.clone();

							lookupStruct lookupHashKey = new lookupStruct();
							lookupStruct lookupDefault = new lookupStruct();

							org.talend.designer.components.persistent.PersistentSortedLookupManager<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.persistent.PersistentSortedLookupManager<row4Struct>) ((org.talend.designer.components.persistent.PersistentSortedLookupManager<row4Struct>) globalMap
									.get("tHash_Lookup_row4"))

							.clone();

							row4Struct row4HashKey = new row4Struct();
							row4Struct row4Default = new row4Struct();
							// ###############################

							// ###############################
							// # Vars initialization
							// ###############################

							// ###############################
							// # Outputs initialization
							// ###############################

							class SortableRow_main
									implements
									Comparable<SortableRow_main>,
									routines.system.IPersistableRow<SortableRow_main> { // G_TM_B_001

								boolean is__rejectedInnerJoin;

								int exprKey_lookup__ID_LOOKUP1;

								// main
								Integer main__ID_MAIN;
								String main__LABEL_MAIN;

								public void fillFrom(mainStruct main,
										int exprKey_lookup__ID_LOOKUP1) {

									this.main__ID_MAIN = main.ID_MAIN;
									this.main__LABEL_MAIN = main.LABEL_MAIN;
									this.exprKey_lookup__ID_LOOKUP1 = exprKey_lookup__ID_LOOKUP1;

								}

								public void copyDataTo(mainStruct main) {

									main.ID_MAIN = this.main__ID_MAIN;
									main.LABEL_MAIN = this.main__LABEL_MAIN;

								}

								public String toString() {

									StringBuilder sb = new StringBuilder();
									sb.append(super.toString());
									sb.append("[");

									sb.append("main__ID_MAIN");
									sb.append("=");
									sb.append(String
											.valueOf(this.main__ID_MAIN));

									sb.append(", ");

									sb.append("main__LABEL_MAIN");
									sb.append("=");
									sb.append(String
											.valueOf(this.main__LABEL_MAIN));

									sb.append("]");

									return sb.toString();
								}

								public int compareTo(SortableRow_main other) {

									int returnValue = 0;

									returnValue = checkNullsAndCompare(
											this.exprKey_lookup__ID_LOOKUP1,
											other.exprKey_lookup__ID_LOOKUP1);
									if (returnValue != 0) {
										return returnValue;
									}

									return returnValue;
								}

								private int checkNullsAndCompare(
										Object object1, Object object2) {

									int ascendingInt = 1;

									int returnValue = 0;
									if (object1 instanceof String
											&& object2 instanceof String) {
										returnValue = compareStrings(
												(String) object1,
												(String) object2);
									} else if (object1 instanceof Comparable
											&& object2 instanceof Comparable) {
										returnValue = ((Comparable) object1)
												.compareTo(object2);
									} else if (object1 != null
											&& object2 != null) {
										returnValue = compareStrings(object1
												.toString(), object2.toString());
									} else if (object1 == null
											&& object2 != null) {
										returnValue = 1;
									} else if (object1 != null
											&& object2 == null) {
										returnValue = -1;
									} else {
										returnValue = 0;
									}

									return ascendingInt * returnValue;
								}

								private int compareStrings(String string1,
										String string2) {
									boolean ignoreCase = true;
									if (ignoreCase) {
										return string1
												.compareToIgnoreCase(string2);
									} else {
										return string1.compareTo(string2);
									}
								}

								public void readData(ObjectInputStream dis) {

									try {

										int length = 0;

										this.is__rejectedInnerJoin = dis
												.readBoolean();

										length = dis.readByte();
										if (length == -1) {
											this.main__ID_MAIN = null;
										} else {
											this.main__ID_MAIN = dis.readInt();
										}

										length = dis.readInt();
										if (length == -1) {
											this.main__LABEL_MAIN = null;
										} else {
											if (length > mainStruct.commonByteArray.length) {
												if (length < 1024
														&& mainStruct.commonByteArray.length == 0) {
													mainStruct.commonByteArray = new byte[1024];
												} else {
													mainStruct.commonByteArray = new byte[2 * length];
												}
											}
											dis.readFully(
													mainStruct.commonByteArray,
													0, length);
											this.main__LABEL_MAIN = new String(
													mainStruct.commonByteArray,
													0, length);
										}

										this.exprKey_lookup__ID_LOOKUP1 = dis
												.readInt();

									} catch (IOException e) {
										throw new RuntimeException(e);

									}
								}

								public void writeData(ObjectOutputStream dos) {
									try {

										dos
												.writeBoolean(this.is__rejectedInnerJoin);

										if (this.main__ID_MAIN == null) {
											dos.writeByte(-1);
										} else {
											dos.writeByte(0);
											dos.writeInt(this.main__ID_MAIN);
										}

										if (this.main__LABEL_MAIN == null) {
											dos.writeInt(-1);
										} else {
											byte[] byteArray = this.main__LABEL_MAIN
													.getBytes();
											dos.writeInt(byteArray.length);
											dos.write(byteArray);
										}

										dos
												.writeInt(this.exprKey_lookup__ID_LOOKUP1);

									} catch (IOException e) {
										throw new RuntimeException(e);
									}
								}

							} // G_TM_B_001

							org.talend.designer.components.persistent.PersistentRowSorterIterator<SortableRow_main> fsi_main = new org.talend.designer.components.persistent.PersistentRowSorterIterator<SortableRow_main>(
									context.data_output_dir + "/" + jobName
											+ "_tMapData_thread"
											+ currentThreadNumber_tMap_4
											+ "_main", 10000000) {
								public SortableRow_main createRowInstance() {
									return new SortableRow_main();
								}
							};

							fsi_main.initPut();

							class SortableRow_main__lookup
									implements
									Comparable<SortableRow_main__lookup>,
									routines.system.IPersistableRow<SortableRow_main__lookup> { // G_TM_B_001

								boolean is__rejectedInnerJoin;

								int exprKey_row4__ID_LOOKUP1;

								// lookup
								Integer main__ID_MAIN;
								String main__LABEL_MAIN;
								int lookup__ID_LOOKUP1;
								String lookup__LABEL_LOOKUP1;

								public void fillFrom(mainStruct main,
										lookupStruct lookup,
										int exprKey_row4__ID_LOOKUP1) {

									this.main__ID_MAIN = main.ID_MAIN;
									this.main__LABEL_MAIN = main.LABEL_MAIN;
									this.lookup__ID_LOOKUP1 = lookup.ID_LOOKUP1;
									this.lookup__LABEL_LOOKUP1 = lookup.LABEL_LOOKUP1;
									this.exprKey_row4__ID_LOOKUP1 = exprKey_row4__ID_LOOKUP1;

								}

								public void copyDataTo(mainStruct main,
										lookupStruct lookup) {

									main.ID_MAIN = this.main__ID_MAIN;
									main.LABEL_MAIN = this.main__LABEL_MAIN;
									lookup.ID_LOOKUP1 = this.lookup__ID_LOOKUP1;
									lookup.LABEL_LOOKUP1 = this.lookup__LABEL_LOOKUP1;

								}

								public String toString() {

									StringBuilder sb = new StringBuilder();
									sb.append(super.toString());
									sb.append("[");

									sb.append("main__ID_MAIN");
									sb.append("=");
									sb.append(String
											.valueOf(this.main__ID_MAIN));

									sb.append(", ");

									sb.append("main__LABEL_MAIN");
									sb.append("=");
									sb.append(String
											.valueOf(this.main__LABEL_MAIN));

									sb.append(", ");

									sb.append("lookup__ID_LOOKUP1");
									sb.append("=");
									sb.append(String
											.valueOf(this.lookup__ID_LOOKUP1));

									sb.append(", ");

									sb.append("lookup__LABEL_LOOKUP1");
									sb.append("=");
									sb
											.append(String
													.valueOf(this.lookup__LABEL_LOOKUP1));

									sb.append("]");

									return sb.toString();
								}

								public int compareTo(
										SortableRow_main__lookup other) {

									int returnValue = 0;

									returnValue = checkNullsAndCompare(
											this.exprKey_row4__ID_LOOKUP1,
											other.exprKey_row4__ID_LOOKUP1);
									if (returnValue != 0) {
										return returnValue;
									}

									return returnValue;
								}

								private int checkNullsAndCompare(
										Object object1, Object object2) {

									int ascendingInt = 1;

									int returnValue = 0;
									if (object1 instanceof String
											&& object2 instanceof String) {
										returnValue = compareStrings(
												(String) object1,
												(String) object2);
									} else if (object1 instanceof Comparable
											&& object2 instanceof Comparable) {
										returnValue = ((Comparable) object1)
												.compareTo(object2);
									} else if (object1 != null
											&& object2 != null) {
										returnValue = compareStrings(object1
												.toString(), object2.toString());
									} else if (object1 == null
											&& object2 != null) {
										returnValue = 1;
									} else if (object1 != null
											&& object2 == null) {
										returnValue = -1;
									} else {
										returnValue = 0;
									}

									return ascendingInt * returnValue;
								}

								private int compareStrings(String string1,
										String string2) {
									boolean ignoreCase = true;
									if (ignoreCase) {
										return string1
												.compareToIgnoreCase(string2);
									} else {
										return string1.compareTo(string2);
									}
								}

								public void readData(ObjectInputStream dis) {

									try {

										int length = 0;

										this.is__rejectedInnerJoin = dis
												.readBoolean();

										length = dis.readByte();
										if (length == -1) {
											this.main__ID_MAIN = null;
										} else {
											this.main__ID_MAIN = dis.readInt();
										}

										length = dis.readInt();
										if (length == -1) {
											this.main__LABEL_MAIN = null;
										} else {
											if (length > lookupStruct.commonByteArray.length) {
												if (length < 1024
														&& lookupStruct.commonByteArray.length == 0) {
													lookupStruct.commonByteArray = new byte[1024];
												} else {
													lookupStruct.commonByteArray = new byte[2 * length];
												}
											}
											dis
													.readFully(
															lookupStruct.commonByteArray,
															0, length);
											this.main__LABEL_MAIN = new String(
													lookupStruct.commonByteArray,
													0, length);
										}

										this.lookup__ID_LOOKUP1 = dis.readInt();

										length = dis.readInt();
										if (length == -1) {
											this.lookup__LABEL_LOOKUP1 = null;
										} else {
											if (length > lookupStruct.commonByteArray.length) {
												if (length < 1024
														&& lookupStruct.commonByteArray.length == 0) {
													lookupStruct.commonByteArray = new byte[1024];
												} else {
													lookupStruct.commonByteArray = new byte[2 * length];
												}
											}
											dis
													.readFully(
															lookupStruct.commonByteArray,
															0, length);
											this.lookup__LABEL_LOOKUP1 = new String(
													lookupStruct.commonByteArray,
													0, length);
										}

										this.exprKey_row4__ID_LOOKUP1 = dis
												.readInt();

									} catch (IOException e) {
										throw new RuntimeException(e);

									}
								}

								public void writeData(ObjectOutputStream dos) {
									try {

										dos
												.writeBoolean(this.is__rejectedInnerJoin);

										if (this.main__ID_MAIN == null) {
											dos.writeByte(-1);
										} else {
											dos.writeByte(0);
											dos.writeInt(this.main__ID_MAIN);
										}

										if (this.main__LABEL_MAIN == null) {
											dos.writeInt(-1);
										} else {
											byte[] byteArray = this.main__LABEL_MAIN
													.getBytes();
											dos.writeInt(byteArray.length);
											dos.write(byteArray);
										}

										dos.writeInt(this.lookup__ID_LOOKUP1);

										if (this.lookup__LABEL_LOOKUP1 == null) {
											dos.writeInt(-1);
										} else {
											byte[] byteArray = this.lookup__LABEL_LOOKUP1
													.getBytes();
											dos.writeInt(byteArray.length);
											dos.write(byteArray);
										}

										dos
												.writeInt(this.exprKey_row4__ID_LOOKUP1);

									} catch (IOException e) {
										throw new RuntimeException(e);
									}
								}

							} // G_TM_B_001

							org.talend.designer.components.persistent.PersistentRowSorterIterator<SortableRow_main__lookup> fsi_main__lookup = new org.talend.designer.components.persistent.PersistentRowSorterIterator<SortableRow_main__lookup>(
									context.data_output_dir + "/" + jobName
											+ "_tMapData_thread"
											+ currentThreadNumber_tMap_4
											+ "_main__lookup", 10000000) {
								public SortableRow_main__lookup createRowInstance() {
									return new SortableRow_main__lookup();
								}
							};

							fsi_main__lookup.initPut();

							/**
							 * [tMap_4_TMAP_OUT begin ] stop
							 */

							/***************************************************
							 * / [tFileInputDelimited_8 begin ] start
							 */

							ok_Hash.put("tFileInputDelimited_8", false);
							start_Hash.put("tFileInputDelimited_8", System
									.currentTimeMillis());
							currentComponent = "tFileInputDelimited_8";

							org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_8 = new org.talend.fileprocess.FileInputDelimited(
									((String) globalMap
											.get("tFileList_2_CURRENT_FILEPATH")),
									"ISO-8859-15", ";", "\n", true, 0, 0, -1,
									-1, false);
							while (fid_tFileInputDelimited_8.nextRecord()) {
								main = null;
								boolean whetherReject_tFileInputDelimited_8 = false;
								main = new mainStruct();
								try {
									String temp_tFileInputDelimited_8 = "";
									temp_tFileInputDelimited_8 = fid_tFileInputDelimited_8
											.get(0).trim();
									if (temp_tFileInputDelimited_8.length() > 0) {
										main.ID_MAIN = ParserUtils
												.parseTo_Integer(temp_tFileInputDelimited_8);
									} else {
										main.ID_MAIN = null;
									}
									main.LABEL_MAIN = fid_tFileInputDelimited_8
											.get(1).trim();

								} catch (Exception e) {
									whetherReject_tFileInputDelimited_8 = true;
									throw (e);
								}

								/**
								 * [tFileInputDelimited_8 begin ] stop
								 */
								/***********************************************
								 * / [tFileInputDelimited_8 main ] start
								 */

								currentComponent = "tFileInputDelimited_8";

								/**
								 * [tFileInputDelimited_8 main ] stop
								 */
								// Start of branch "main"
								if (main != null) {

									/*******************************************
									 * / [tMap_4_TMAP_OUT main ] start
									 */

									currentComponent = "tMap_4_TMAP_OUT";

									// main
									// main

									runStat
											.updateStatOnConnection(
													"main"
															+ (globalMap
																	.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
																	.get("PARALLEL_ITERATOR_THREAD_ID"))
																	: ""), 1, 1);

									boolean hasCasePrimitiveKeyWithNull_tMap_4_TMAP_OUT = false;

									hasCasePrimitiveKeyWithNull_tMap_4_TMAP_OUT = false;

									int exprKey_lookup__ID_LOOKUP1 = 0;
									Object exprKeyValue_lookup__ID_LOOKUP1 = main.ID_MAIN;
									if (exprKeyValue_lookup__ID_LOOKUP1 == null) {
										hasCasePrimitiveKeyWithNull_tMap_4_TMAP_OUT = true;
									} else {
										exprKey_lookup__ID_LOOKUP1 = (int) (Integer) exprKeyValue_lookup__ID_LOOKUP1;
									}

									SortableRow_main rsc_main = fsi_main
											.getNextFreeRow();

									rsc_main.fillFrom(main,
											exprKey_lookup__ID_LOOKUP1);

									fsi_main.put(rsc_main);

									// ###############################
									// # Input tables (lookups)
									boolean rejectedInnerJoin_tMap_4_TMAP_OUT = false;
									boolean mainRowRejected_tMap_4_TMAP_OUT = false;

									// { // Dummy bracket to open block for
									// "main" ##(1)##

									// ###############################
									{ // start of Var scope

										// ###############################
										// # Vars tables
										// ###############################
										// ###############################
										// # Output tables

										// ###############################

									} // end of Var scope

									rejectedInnerJoin_tMap_4_TMAP_OUT = false;

									/**
									 * [tMap_4_TMAP_OUT main ] stop
									 */

								} // End of branch "main"

								/***********************************************
								 * / [tFileInputDelimited_8 end ] start
								 */

								currentComponent = "tFileInputDelimited_8";

							}
							fid_tFileInputDelimited_8.close();
							globalMap.put("tFileInputDelimited_8_NB_LINE",
									fid_tFileInputDelimited_8.getRowNumber());
							runStat
									.updateStatOnConnection(
											"main"
													+ (globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID"))
															: ""), 2, 0);

							ok_Hash.put("tFileInputDelimited_8", true);
							end_Hash.put("tFileInputDelimited_8", System
									.currentTimeMillis());

							/**
							 * [tFileInputDelimited_8 end ] stop
							 */
							/***************************************************
							 * / [tMap_4_TMAP_OUT end ] start
							 */

							currentComponent = "tMap_4_TMAP_OUT";

							// ###############################
							// # Lookup hashes releasing
							// ###############################

							ok_Hash.put("tMap_4_TMAP_OUT", true);
							end_Hash.put("tMap_4_TMAP_OUT", System
									.currentTimeMillis());

							/**
							 * [tMap_4_TMAP_OUT end ] stop
							 */

							/***************************************************
							 * / [tFileOutputDelimited_2 begin ] start
							 */

							ok_Hash.put("tFileOutputDelimited_2", false);
							start_Hash.put("tFileOutputDelimited_2", System
									.currentTimeMillis());
							currentComponent = "tFileOutputDelimited_2";

							runStat
									.updateStatOnConnection(
											"out"
													+ (globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID"))
															: ""), 0, 0);

							String fileName_tFileOutputDelimited_2 = (new java.io.File(
									context.data_output_dir
											+ context.current_job_dir
											+ "/out_"
											+ ((String) globalMap
													.get("tFileList_2_CURRENT_FILE"))))
									.getAbsolutePath().replace("\\", "/");
							String fullName_tFileOutputDelimited_2 = null;
							String extension_tFileOutputDelimited_2 = null;
							String directory_tFileOutputDelimited_2 = null;
							if ((fileName_tFileOutputDelimited_2.indexOf("/") != -1)) {
								if (fileName_tFileOutputDelimited_2
										.lastIndexOf(".") < fileName_tFileOutputDelimited_2
										.lastIndexOf("/")) {
									fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
									extension_tFileOutputDelimited_2 = "";
								} else {
									fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
											.substring(0,
													fileName_tFileOutputDelimited_2
															.lastIndexOf("."));
									extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
											.substring(fileName_tFileOutputDelimited_2
													.lastIndexOf("."));
								}
								directory_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
										.substring(0,
												fileName_tFileOutputDelimited_2
														.lastIndexOf("/"));
							} else {
								if (fileName_tFileOutputDelimited_2
										.lastIndexOf(".") != -1) {
									fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
											.substring(0,
													fileName_tFileOutputDelimited_2
															.lastIndexOf("."));
									extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
											.substring(fileName_tFileOutputDelimited_2
													.lastIndexOf("."));
								} else {
									fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
									extension_tFileOutputDelimited_2 = "";
								}
								directory_tFileOutputDelimited_2 = "";
							}

							int nb_line_tFileOutputDelimited_2 = 0;
							int splitEvery_tFileOutputDelimited_2 = 1000;
							int splitedFileNo_tFileOutputDelimited_2 = 0;
							int currentRow_tFileOutputDelimited_2 = 0;

							final String OUT_DELIM_tFileOutputDelimited_2 = /**
																			 * Start
																			 * field
																			 * tFileOutputDelimited_2:FIELDSEPARATOR
																			 */
							";"/**
								 * End field
								 * tFileOutputDelimited_2:FIELDSEPARATOR
								 */
							;

							final String OUT_DELIM_ROWSEP_tFileOutputDelimited_2 = /**
																					 * Start
																					 * field
																					 * tFileOutputDelimited_2:ROWSEPARATOR
																					 */
							"\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */
							;

							// create directory only if not exists
							if (directory_tFileOutputDelimited_2 != null
									&& directory_tFileOutputDelimited_2.trim()
											.length() != 0) {
								java.io.File dir_tFileOutputDelimited_2 = new java.io.File(
										directory_tFileOutputDelimited_2);
								if (!dir_tFileOutputDelimited_2.exists()) {
									dir_tFileOutputDelimited_2.mkdirs();
								}
							}

							// routines.system.Row
							java.io.Writer outtFileOutputDelimited_2 = new java.io.BufferedWriter(
									new java.io.OutputStreamWriter(
											new java.io.FileOutputStream(
													fileName_tFileOutputDelimited_2,
													false), "ISO-8859-15"));
							java.io.File filetFileOutputDelimited_2 = new java.io.File(
									fileName_tFileOutputDelimited_2);

							/**
							 * [tFileOutputDelimited_2 begin ] stop
							 */

							/***************************************************
							 * / [tMap_4_TMAP_IN begin ] start
							 */

							ok_Hash.put("tMap_4_TMAP_IN", false);
							start_Hash.put("tMap_4_TMAP_IN", System
									.currentTimeMillis());
							currentComponent = "tMap_4_TMAP_IN";

							// ###############################
							// # Lookup's keys initialization
							// ###############################

							// ###############################
							// # Vars initialization
							// ###############################

							// ###############################
							// # Outputs initialization
							outStruct out_tmp = new outStruct();
							// ###############################

							/**
							 * [tMap_4_TMAP_IN begin ] stop
							 */
							/***************************************************
							 * / [tMap_4_TMAP_IN main ] start
							 */

							currentComponent = "tMap_4_TMAP_IN";

							boolean hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN = false;

							fsi_main.endPut();

							// ###############################
							// # Input tables (lookups)
							boolean rejectedInnerJoin_tMap_4_TMAP_IN = false;
							boolean mainRowRejected_tMap_4_TMAP_IN = false;

							// /////////////////////////////////////////////
							// Starting Lookup Table "lookup"
							// /////////////////////////////////////////////

							SortableRow_main rsc_main;

							tHash_Lookup_lookup.initGet();

							fsi_main.initGet();

							// TEST firstLookupIsPersistentSorted=true
							// isFirstPersistentSortedTable=true

							rejectedInnerJoin_tMap_4_TMAP_IN = false;

							while (fsi_main.hasNext()) { // G_TM_M_250 loop
															// "main"

								rsc_main = (SortableRow_main) fsi_main.next();
								rsc_main.copyDataTo(main);

								rejectedInnerJoin_tMap_4_TMAP_IN = rsc_main.is__rejectedInnerJoin;

								boolean forceLooplookup = false;

								lookupStruct lookupObjectFromLookup = null;

								if (!rejectedInnerJoin_tMap_4_TMAP_IN) { // G 20

									hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN = false;

									Object exprKeyValue_lookup__ID_LOOKUP1 = main.ID_MAIN;
									if (exprKeyValue_lookup__ID_LOOKUP1 == null) {
										hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN = true;
									} else {
										lookupHashKey.ID_LOOKUP1 = (int) (Integer) rsc_main.exprKey_lookup__ID_LOOKUP1;
									}

									if (!hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN) { // G_TM_M_091

										tHash_Lookup_lookup
												.lookup(lookupHashKey);

									} // G_TM_M_091

									if (hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN
											|| !tHash_Lookup_lookup.hasNext()) { // G
																					// 090

										forceLooplookup = true;

									} // G 090

								} // G 20

								else { // G 20 - G 21
									forceLooplookup = true;
								} // G 21

								lookupStruct lookup = null;

								while (tHash_Lookup_lookup.hasNext()
										|| forceLooplookup) { // G_TM_M_043

									lookupStruct fromLookup_lookup = null;
									lookup = lookupDefault;

									if (!forceLooplookup) { // G 46

										fromLookup_lookup = tHash_Lookup_lookup
												.next();

										if (fromLookup_lookup != null) {
											lookup = fromLookup_lookup;
										}

									} // G 46

									forceLooplookup = false;

									int exprKey_row4__ID_LOOKUP1 = 0;

									if (!rejectedInnerJoin_tMap_4_TMAP_IN) { // G_TM_M_255

										Object exprKeyValue_row4__ID_LOOKUP1 = lookup.ID_LOOKUP1;
										if (exprKeyValue_row4__ID_LOOKUP1 == null) {
											hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN = true;
										} else {
											exprKey_row4__ID_LOOKUP1 = (int) (Integer) exprKeyValue_row4__ID_LOOKUP1;
										}

									} // G_TM_M_255

									SortableRow_main__lookup rsc_main__lookup = new SortableRow_main__lookup();

									rsc_main__lookup.fillFrom(main, lookup,
											exprKey_row4__ID_LOOKUP1);

									rsc_main__lookup.is__rejectedInnerJoin = rejectedInnerJoin_tMap_4_TMAP_IN;

									rejectedInnerJoin_tMap_4_TMAP_IN = false;

									// Sort and store in KeyFile(s) and
									// DataFile(s)
									fsi_main__lookup.put(rsc_main__lookup);

									if (forceLooplookup) {
										break;
									}

								} // G_TM_M_043 loop (MultipleResult) lookup

							} // G_TM_M_250 loop "main"

							fsi_main.endGet();

							fsi_main__lookup.endPut();

							// /////////////////////////////////////////////
							// Starting Lookup Table "row4"
							// /////////////////////////////////////////////

							SortableRow_main__lookup rsc_main__lookup;

							tHash_Lookup_row4.initGet();

							fsi_main__lookup.initGet();

							// lookup = new lookupStruct();

							lookupStruct lookup = new lookupStruct();

							// TEST firstLookupIsPersistentSorted=true
							// isFirstPersistentSortedTable=false

							rejectedInnerJoin_tMap_4_TMAP_IN = false;

							while (fsi_main__lookup.hasNext()) { // G_TM_M_250
																	// loop
																	// "main__lookup"

								// CALL close loop of lookup 'main__lookup'

								rsc_main__lookup = (SortableRow_main__lookup) fsi_main__lookup
										.next();
								rsc_main__lookup.copyDataTo(main, lookup);

								rejectedInnerJoin_tMap_4_TMAP_IN = rsc_main__lookup.is__rejectedInnerJoin;

								boolean forceLooprow4 = false;

								row4Struct row4ObjectFromLookup = null;

								if (!rejectedInnerJoin_tMap_4_TMAP_IN) { // G 20

									hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN = false;

									Object exprKeyValue_row4__ID_LOOKUP1 = lookup.ID_LOOKUP1;
									if (exprKeyValue_row4__ID_LOOKUP1 == null) {
										hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN = true;
									} else {
										row4HashKey.ID_LOOKUP1 = (int) (Integer) rsc_main__lookup.exprKey_row4__ID_LOOKUP1;
									}

									if (!hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN) { // G_TM_M_091

										tHash_Lookup_row4.lookup(row4HashKey);

									} // G_TM_M_091

									if (hasCasePrimitiveKeyWithNull_tMap_4_TMAP_IN
											|| !tHash_Lookup_row4.hasNext()) { // G
																				// 090

										forceLooprow4 = true;

									} // G 090

								} // G 20

								else { // G 20 - G 21
									forceLooprow4 = true;
								} // G 21

								row4Struct row4 = null;

								while (tHash_Lookup_row4.hasNext()
										|| forceLooprow4) { // G_TM_M_043

									// CALL close loop of lookup 'row4'

									row4Struct fromLookup_row4 = null;
									row4 = row4Default;

									if (!forceLooprow4) { // G 46

										fromLookup_row4 = tHash_Lookup_row4
												.next();

										if (fromLookup_row4 != null) {
											row4 = fromLookup_row4;
										}

									} // G 46

									forceLooprow4 = false;

									// { // Dummy bracket to open block for
									// "main" ##(1)##

									// ###############################
									{ // start of Var scope

										// ###############################
										// # Vars tables
										// ###############################
										// ###############################
										// # Output tables

										out = null;

										// # Output table : 'out'
										out_tmp.ID_MAIN = main.ID_MAIN;
										out_tmp.LABEL_MAIN = main.LABEL_MAIN;
										out_tmp.ID_LOOKUP1 = lookup.ID_LOOKUP1;
										out_tmp.LABEL_LOOKUP1 = lookup.LABEL_LOOKUP1;
										out_tmp.ID_LOOKUP1_1 = row4.ID_LOOKUP1;
										out_tmp.LABEL_LOOKUP1_1 = row4.LABEL_LOOKUP1;
										out = out_tmp;
										// ###############################

									} // end of Var scope

									rejectedInnerJoin_tMap_4_TMAP_IN = false;

									/**
									 * [tMap_4_TMAP_IN main ] stop
									 */
									// Start of branch "out"
									if (out != null) {

										/***************************************
										 * / [tFileOutputDelimited_2 main ]
										 * start
										 */

										currentComponent = "tFileOutputDelimited_2";

										// out
										// out

										runStat
												.updateStatOnConnection(
														"out"
																+ (globalMap
																		.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
																		.get("PARALLEL_ITERATOR_THREAD_ID"))
																		: ""),
														1, 1);

										StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();

										if (out.ID_MAIN != null) {

											sb_tFileOutputDelimited_2.append(

											out.ID_MAIN

											);

										}

										sb_tFileOutputDelimited_2
												.append(OUT_DELIM_tFileOutputDelimited_2);

										if (out.LABEL_MAIN != null) {

											sb_tFileOutputDelimited_2.append(

											out.LABEL_MAIN

											);

										}

										sb_tFileOutputDelimited_2
												.append(OUT_DELIM_tFileOutputDelimited_2);

										if (out.ID_LOOKUP1 != null) {

											sb_tFileOutputDelimited_2.append(

											out.ID_LOOKUP1

											);

										}

										sb_tFileOutputDelimited_2
												.append(OUT_DELIM_tFileOutputDelimited_2);

										if (out.LABEL_LOOKUP1 != null) {

											sb_tFileOutputDelimited_2.append(

											out.LABEL_LOOKUP1

											);

										}

										sb_tFileOutputDelimited_2
												.append(OUT_DELIM_tFileOutputDelimited_2);

										sb_tFileOutputDelimited_2.append(

										out.ID_LOOKUP1_1

										);

										sb_tFileOutputDelimited_2
												.append(OUT_DELIM_tFileOutputDelimited_2);

										if (out.LABEL_LOOKUP1_1 != null) {

											sb_tFileOutputDelimited_2.append(

											out.LABEL_LOOKUP1_1

											);

										}

										sb_tFileOutputDelimited_2
												.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);

										synchronized (lockWrite) {

											outtFileOutputDelimited_2
													.write(sb_tFileOutputDelimited_2
															.toString());

										}

										nb_line_tFileOutputDelimited_2++;

										/**
										 * [tFileOutputDelimited_2 main ] stop
										 */

									} // End of branch "out"

								} // close loop of lookup 'row4' // G_TM_M_043

							} // G_TM_M_250 close loop read file data
								// 'main__lookup'
							/***************************************************
							 * / [tMap_4_TMAP_IN end ] start
							 */

							currentComponent = "tMap_4_TMAP_IN";

							// ###############################
							// # Lookup hashes releasing
							fsi_main__lookup.endGet();

							// ###############################

							runStat
									.updateStatOnConnection(
											"out"
													+ (globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID"))
															: ""), 2, 0);

							ok_Hash.put("tMap_4_TMAP_IN", true);
							end_Hash.put("tMap_4_TMAP_IN", System
									.currentTimeMillis());

							/**
							 * [tMap_4_TMAP_IN end ] stop
							 */
							/***************************************************
							 * / [tFileOutputDelimited_2 end ] start
							 */

							currentComponent = "tFileOutputDelimited_2";

							synchronized (lockWrite) {

								outtFileOutputDelimited_2.close();
								globalMap.put("tFileOutputDelimited_2_NB_LINE",
										nb_line_tFileOutputDelimited_2);

							}

							ok_Hash.put("tFileOutputDelimited_2", true);
							end_Hash.put("tFileOutputDelimited_2", System
									.currentTimeMillis());

							/**
							 * [tFileOutputDelimited_2 end ] stop
							 */

							/***************************************************
							 * / [tFileList_2 end ] start
							 */

							runStat
									.updateStatOnConnection(
											"iterate1",
											2,
											"exec"
													+ globalMap
															.get("PARALLEL_ITERATOR_THREAD_ID"));
						} catch (Exception e) {
							e.printStackTrace();
						}
						this.isRunning = false;
					}
				}

				tFileList_2Thread bt_tFileList_2 = new tFileList_2Thread(
						globalMap, main, out, threadIdCounter++);
				mtp_tFileList_2.execute(bt_tFileList_2);

				currentComponent = "tFileList_2";

			}

			globalMap.put("tFileList_2_NB_FILE", NB_FILEtFileList_2);

			ok_Hash.put("tFileList_2", true);
			end_Hash.put("tFileList_2", System.currentTimeMillis());

			mtp_tFileList_2.waitForEndOfQueue();

			/**
			 * [tFileList_2 end ] stop
			 */
			tFileList_3Process();

		} catch (Exception e) {

			throw new TalendException(this, e);
		}

		globalMap.put("tFileList_2_SUBPROCESS_STATE", 1);
	}

	static class row2Struct implements
			routines.system.IPersistableRow<row2Struct> {
		static byte[] commonByteArray = new byte[0];

		String file;

		String file_ref;

		java.util.Date moment;

		String job;

		String component;

		Integer differ;

		String message;

		public void readData(ObjectInputStream dis) {

			try {

				int length = 0;

				length = dis.readInt();
				if (length == -1) {
					this.file = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.file = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.file_ref = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.file_ref = new String(commonByteArray, 0, length);
				}

				length = dis.readByte();
				if (length == -1) {
					this.moment = null;
				} else {
					this.moment = new Date(dis.readLong());
				}

				length = dis.readInt();
				if (length == -1) {
					this.job = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.job = new String(commonByteArray, 0, length);
				}

				length = dis.readInt();
				if (length == -1) {
					this.component = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.component = new String(commonByteArray, 0, length);
				}

				length = dis.readByte();
				if (length == -1) {
					this.differ = null;
				} else {
					this.differ = dis.readInt();
				}

				length = dis.readInt();
				if (length == -1) {
					this.message = null;
				} else {
					if (length > commonByteArray.length) {
						if (length < 1024 && commonByteArray.length == 0) {
							commonByteArray = new byte[1024];
						} else {
							commonByteArray = new byte[2 * length];
						}
					}
					dis.readFully(commonByteArray, 0, length);
					this.message = new String(commonByteArray, 0, length);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				if (this.file == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.file.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.file_ref == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.file_ref.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// java.util.Date

				if (this.moment == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeLong(this.moment.getTime());
				}

				// String

				if (this.job == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.job.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// String

				if (this.component == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.component.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

				// Integer

				if (this.differ == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeInt(this.differ);
				}

				// String

				if (this.message == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.message.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("file");
			sb.append("=");
			sb.append(String.valueOf(this.file));

			sb.append(", ");

			sb.append("file_ref");
			sb.append("=");
			sb.append(String.valueOf(this.file_ref));

			sb.append(", ");

			sb.append("moment");
			sb.append("=");
			sb.append(String.valueOf(this.moment));

			sb.append(", ");

			sb.append("job");
			sb.append("=");
			sb.append(String.valueOf(this.job));

			sb.append(", ");

			sb.append("component");
			sb.append("=");
			sb.append(String.valueOf(this.component));

			sb.append(", ");

			sb.append("differ");
			sb.append("=");
			sb.append(String.valueOf(this.differ));

			sb.append(", ");

			sb.append("message");
			sb.append("=");
			sb.append(String.valueOf(this.message));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row2Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	public void tFileList_3Process() throws TalendException {
		globalMap.put("tFileList_3_SUBPROCESS_STATE", 0);
		try {

			row2Struct row2 = new row2Struct();
			/*******************************************************************
			 * / [tFileList_3 begin ] start
			 */

			ok_Hash.put("tFileList_3", false);
			start_Hash.put("tFileList_3", System.currentTimeMillis());
			currentComponent = "tFileList_3";

			// tFileList_Begin

			String directory_tFileList_3 = context.getProperty("data_dir")
					+ context.getProperty("current_job_dir") + "in";
			String filemask_tFileList_3 = "main_*.csv" + "$";
			if (filemask_tFileList_3.indexOf("^") == -1)
				filemask_tFileList_3 = "^" + filemask_tFileList_3;
			filemask_tFileList_3 = java.util.regex.Pattern.compile("[*]")
					.matcher(filemask_tFileList_3).replaceAll(".*");

			boolean case_sensitive_tFileList_3 = true;
			java.util.regex.Pattern fileNamePattern_tFileList_3 = java.util.regex.Pattern
					.compile(filemask_tFileList_3);
			if (!case_sensitive_tFileList_3) {
				fileNamePattern_tFileList_3 = java.util.regex.Pattern.compile(
						filemask_tFileList_3,
						java.util.regex.Pattern.CASE_INSENSITIVE);
			}
			java.io.File file_tFileList_3 = new java.io.File(
					directory_tFileList_3);
			final java.util.List<java.io.File> list_tFileList_3 = new java.util.ArrayList<java.io.File>();
			file_tFileList_3.listFiles(new java.io.FilenameFilter() {
				public boolean accept(java.io.File dir, String name) {
					java.io.File file = new java.io.File(dir, name);
					if (!file.isDirectory()) {
						list_tFileList_3.add(file);
					}
					return true;
				}
			});
			int NB_FILEtFileList_3 = 0;
			for (int i_tFileList_3 = 0; i_tFileList_3 < list_tFileList_3.size(); i_tFileList_3++) {

				java.io.File files_tFileList_3 = list_tFileList_3
						.get(i_tFileList_3);
				String fileName_tFileList_3 = files_tFileList_3.getName();
				if (!fileNamePattern_tFileList_3.matcher(fileName_tFileList_3)
						.find()) {
					continue;
				}

				String currentFileName_tFileList_3 = files_tFileList_3
						.getName();
				String currentFilePath_tFileList_3 = files_tFileList_3
						.getAbsolutePath();
				NB_FILEtFileList_3++;

				globalMap.put("tFileList_3_CURRENT_FILE",
						currentFileName_tFileList_3);
				globalMap.put("tFileList_3_CURRENT_FILEPATH",
						currentFilePath_tFileList_3);

				/**
				 * [tFileList_3 begin ] stop
				 */
				/***************************************************************
				 * / [tFileList_3 main ] start
				 */

				currentComponent = "tFileList_3";

				/**
				 * [tFileList_3 main ] stop
				 */

				/***************************************************************
				 * / [tAssert_1 begin ] start
				 */

				ok_Hash.put("tAssert_1", false);
				start_Hash.put("tAssert_1", System.currentTimeMillis());
				currentComponent = "tAssert_1";

				runStat
						.updateStatOnConnection(
								"row2"
										+ (globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID"))
												: ""), 0, 0);

				/**
				 * [tAssert_1 begin ] stop
				 */

				/***************************************************************
				 * / [tFileCompare_1 begin ] start
				 */

				ok_Hash.put("tFileCompare_1", false);
				start_Hash.put("tFileCompare_1", System.currentTimeMillis());
				currentComponent = "tFileCompare_1";

				/**
				 * [tFileCompare_1 begin ] stop
				 */
				/***************************************************************
				 * / [tFileCompare_1 main ] start
				 */

				currentComponent = "tFileCompare_1";

				boolean result_tFileCompare_1 = true;

				if (result_tFileCompare_1) {

					java.io.BufferedReader file_tFileCompare_1 = new java.io.BufferedReader(
							new java.io.FileReader(context.data_output_dir
									+ context.current_job_dir
									+ "/out_"
									+ ((String) globalMap
											.get("tFileList_3_CURRENT_FILE"))));
					java.io.BufferedReader fileRef_tFileCompare_1 = new java.io.BufferedReader(
							new java.io.FileReader(context
									.getProperty("data_dir")
									+ context.getProperty("current_job_dir")
									+ "ref/out_"
									+ ((String) globalMap
											.get("tFileList_3_CURRENT_FILE"))));
					String content_tFileCompare_1 = null, contentRef_tFileCompare_1 = null;
					while ((content_tFileCompare_1 = file_tFileCompare_1
							.readLine()) != null
							&& (contentRef_tFileCompare_1 = fileRef_tFileCompare_1
									.readLine()) != null) {
						if (content_tFileCompare_1
								.compareTo(contentRef_tFileCompare_1) != 0) {
							result_tFileCompare_1 = false;
							break;
						}
					}

					// Check if files has a different number of lines:
					if (content_tFileCompare_1 == null) {
						// This step is done in case of the while upper ignore
						// second part:
						contentRef_tFileCompare_1 = fileRef_tFileCompare_1
								.readLine();
					}
					if (content_tFileCompare_1 != null
							|| contentRef_tFileCompare_1 != null) {
						result_tFileCompare_1 = false;
					}

					file_tFileCompare_1.close();
					fileRef_tFileCompare_1.close();

				}

				String messagetFileCompare_1 = "";
				if (result_tFileCompare_1) {
					messagetFileCompare_1 = "[" + jobName + "."
							+ currentComponent + "] Ok";

				} else {
					messagetFileCompare_1 = "["
							+ jobName
							+ "."
							+ currentComponent
							+ "] Files "
							+ "'out_"
							+ ((String) globalMap
									.get("tFileList_3_CURRENT_FILE"))
							+ "' differ";
				}
				globalMap.put("tFileCompare_1_DIFFERENCE",
						result_tFileCompare_1);

				System.out.println(messagetFileCompare_1);
				row2.file = context.data_output_dir + context.current_job_dir
						+ "/out_"
						+ ((String) globalMap.get("tFileList_3_CURRENT_FILE"));
				row2.file_ref = context.getProperty("data_dir")
						+ context.getProperty("current_job_dir") + "ref/out_"
						+ ((String) globalMap.get("tFileList_3_CURRENT_FILE"));
				row2.moment = java.util.Calendar.getInstance().getTime();
				row2.job = jobName;
				row2.component = currentComponent;
				row2.differ = (result_tFileCompare_1) ? 0 : 1;
				row2.message = messagetFileCompare_1;

				/**
				 * [tFileCompare_1 main ] stop
				 */
				/***************************************************************
				 * / [tAssert_1 main ] start
				 */

				currentComponent = "tAssert_1";

				// row2
				// row2

				runStat
						.updateStatOnConnection(
								"row2"
										+ (globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID"))
												: ""), 1, 1);

				if (((Boolean) globalMap.get("tFileCompare_1_DIFFERENCE"))) {
					tAssertCatcher_1.addMessage(pid, projectName, jobName,
							"java", "tAssert_1", "Ok", "--",
							"Simple mode replace");
					tAssertCatcher_1Process();
				} else {
					tAssertCatcher_1.addMessage(pid, projectName, jobName,
							"java", "tAssert_1", "Failed",
							"Test logically failed", "Simple mode replace");
					tAssertCatcher_1Process();
				}

				/**
				 * [tAssert_1 main ] stop
				 */

				/***************************************************************
				 * / [tFileCompare_1 end ] start
				 */

				currentComponent = "tFileCompare_1";

				runStat
						.updateStatOnConnection(
								"row2"
										+ (globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
												.get("PARALLEL_ITERATOR_THREAD_ID"))
												: ""), 2, 0);

				ok_Hash.put("tFileCompare_1", true);
				end_Hash.put("tFileCompare_1", System.currentTimeMillis());

				/**
				 * [tFileCompare_1 end ] stop
				 */
				/***************************************************************
				 * / [tAssert_1 end ] start
				 */

				currentComponent = "tAssert_1";

				ok_Hash.put("tAssert_1", true);
				end_Hash.put("tAssert_1", System.currentTimeMillis());

				/**
				 * [tAssert_1 end ] stop
				 */

				/***************************************************************
				 * / [tFileList_3 end ] start
				 */

				currentComponent = "tFileList_3";

			}

			globalMap.put("tFileList_3_NB_FILE", NB_FILEtFileList_3);

			ok_Hash.put("tFileList_3", true);
			end_Hash.put("tFileList_3", System.currentTimeMillis());

			/**
			 * [tFileList_3 end ] stop
			 */

		} catch (Exception e) {

			throw new TalendException(this, e);
		}

		globalMap.put("tFileList_3_SUBPROCESS_STATE", 1);
	}

	static class row4Struct implements
			routines.system.IPersistableComparableLookupRow<row4Struct> {
		static byte[] commonByteArray = new byte[0];
		private static final int DEFAULT_HASHCODE = 1;
		private static final int PRIME = 31;
		private int hashCode = DEFAULT_HASHCODE;
		public boolean hashCodeDirty = true;

		int ID_LOOKUP1;

		String LABEL_LOOKUP1;

		@Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;

				result = prime * result + (int) this.ID_LOOKUP1;

				this.hashCode = result;
				this.hashCodeDirty = false;
			}
			return this.hashCode;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final row4Struct other = (row4Struct) obj;

			if (this.ID_LOOKUP1 != other.ID_LOOKUP1)
				return false;

			return true;
		}

		public void copyDataTo(row4Struct other) {

			other.ID_LOOKUP1 = this.ID_LOOKUP1;
			other.LABEL_LOOKUP1 = this.LABEL_LOOKUP1;

		}

		public void copyKeysDataTo(row4Struct other) {

			other.ID_LOOKUP1 = this.ID_LOOKUP1;

		}

		public void readKeysData(ObjectInputStream dis) {

			try {

				int length = 0;

				this.ID_LOOKUP1 = dis.readInt();

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeKeysData(ObjectOutputStream dos) {
			try {

				// int

				dos.writeInt(this.ID_LOOKUP1);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		/**
		 * Fill Values data by reading ObjectInputStream.
		 */
		public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
			try {

				int length = 0;

				length = dis.readInt();
				if (length == -1) {
					this.LABEL_LOOKUP1 = null;
				} else {
					byte[] byteArray = new byte[length];
					dis.read(byteArray);
					this.LABEL_LOOKUP1 = new String(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		/**
		 * Return a byte array which represents Values data.
		 */
		public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
			try {

				if (this.LABEL_LOOKUP1 == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.LABEL_LOOKUP1.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("ID_LOOKUP1");
			sb.append("=");
			sb.append(String.valueOf(this.ID_LOOKUP1));

			sb.append(", ");

			sb.append("LABEL_LOOKUP1");
			sb.append("=");
			sb.append(String.valueOf(this.LABEL_LOOKUP1));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row4Struct other) {

			int returnValue = -1;

			returnValue = checkNullsAndCompare(this.ID_LOOKUP1,
					other.ID_LOOKUP1);
			if (returnValue != 0) {
				return returnValue;
			}

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	public void tFileInputDelimited_5Process() throws TalendException {
		globalMap.put("tFileInputDelimited_5_SUBPROCESS_STATE", 0);
		try {

			row4Struct row4 = new row4Struct();

			/*******************************************************************
			 * / [tAdvancedHash_row4 begin ] start
			 */

			ok_Hash.put("tAdvancedHash_row4", false);
			start_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());
			currentComponent = "tAdvancedHash_row4";

			runStat
					.updateStatOnConnection(
							"row4"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 0, 0);

			org.talend.designer.components.commons.AdvancedLookup.MATCHING_MODE matchingModeEnum_row4 = org.talend.designer.components.commons.AdvancedLookup.MATCHING_MODE.ALL_MATCHES;

			org.talend.designer.components.persistent.PersistentSortedLookupManager<row4Struct> tHash_Lookup_row4 = new org.talend.designer.components.persistent.PersistentSortedLookupManager<row4Struct>(
					matchingModeEnum_row4,
					context.data_output_dir + "/" + jobName
							+ "_tMapData_Lookup_row4_",
					new org.talend.designer.components.persistent.IRowCreator() {
						public row4Struct createRowInstance() {
							return new row4Struct();
						}
					}

					, 10000000

			);

			tHash_Lookup_row4.initPut();

			globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);

			/**
			 * [tAdvancedHash_row4 begin ] stop
			 */

			/*******************************************************************
			 * / [tFileInputDelimited_5 begin ] start
			 */

			ok_Hash.put("tFileInputDelimited_5", false);
			start_Hash.put("tFileInputDelimited_5", System.currentTimeMillis());
			currentComponent = "tFileInputDelimited_5";

			org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_5 = new org.talend.fileprocess.FileInputDelimited(
					context.getProperty("data_dir")
							+ context.getProperty("current_job_dir")
							+ "in/lookup.csv", "ISO-8859-15", ";", "\n", true,
					0, 0, -1, -1, false);
			while (fid_tFileInputDelimited_5.nextRecord()) {
				row4 = null;
				row4 = null;
				boolean whetherReject_tFileInputDelimited_5 = false;
				row4 = new row4Struct();
				try {
					String temp_tFileInputDelimited_5 = "";
					temp_tFileInputDelimited_5 = fid_tFileInputDelimited_5.get(
							0).trim();
					if (temp_tFileInputDelimited_5.length() > 0) {
						row4.ID_LOOKUP1 = ParserUtils
								.parseTo_int(temp_tFileInputDelimited_5);
					} else {
						throw new RuntimeException(
								"Value is empty for column : 'ID_LOOKUP1' in 'row4' connection, value is invalid or this column should be nullable or have a default value.");
					}
					row4.LABEL_LOOKUP1 = fid_tFileInputDelimited_5.get(1)
							.trim();

				} catch (Exception e) {
					whetherReject_tFileInputDelimited_5 = true;
					throw (e);
				}

				/**
				 * [tFileInputDelimited_5 begin ] stop
				 */
				/***************************************************************
				 * / [tFileInputDelimited_5 main ] start
				 */

				currentComponent = "tFileInputDelimited_5";

				/**
				 * [tFileInputDelimited_5 main ] stop
				 */
				// Start of branch "row4"
				if (row4 != null) {

					/***********************************************************
					 * / [tAdvancedHash_row4 main ] start
					 */

					currentComponent = "tAdvancedHash_row4";

					// row4
					// row4

					runStat
							.updateStatOnConnection(
									"row4"
											+ (globalMap
													.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
													.get("PARALLEL_ITERATOR_THREAD_ID"))
													: ""), 1, 1);

					row4Struct row4_HashRow = tHash_Lookup_row4
							.getNextFreeRow();

					row4_HashRow.ID_LOOKUP1 = row4.ID_LOOKUP1;
					row4_HashRow.LABEL_LOOKUP1 = row4.LABEL_LOOKUP1;
					tHash_Lookup_row4.put(row4_HashRow);

					/**
					 * [tAdvancedHash_row4 main ] stop
					 */

				} // End of branch "row4"

				/***************************************************************
				 * / [tFileInputDelimited_5 end ] start
				 */

				currentComponent = "tFileInputDelimited_5";

			}
			fid_tFileInputDelimited_5.close();
			globalMap.put("tFileInputDelimited_5_NB_LINE",
					fid_tFileInputDelimited_5.getRowNumber());
			runStat
					.updateStatOnConnection(
							"row4"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 2, 0);

			ok_Hash.put("tFileInputDelimited_5", true);
			end_Hash.put("tFileInputDelimited_5", System.currentTimeMillis());

			/**
			 * [tFileInputDelimited_5 end ] stop
			 */
			/*******************************************************************
			 * / [tAdvancedHash_row4 end ] start
			 */

			currentComponent = "tAdvancedHash_row4";

			tHash_Lookup_row4.endPut();

			ok_Hash.put("tAdvancedHash_row4", true);
			end_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());

			/**
			 * [tAdvancedHash_row4 end ] stop
			 */

		} catch (Exception e) {

			throw new TalendException(this, e);
		}

		globalMap.put("tFileInputDelimited_5_SUBPROCESS_STATE", 1);
	}

	static class lookupStruct implements
			routines.system.IPersistableComparableLookupRow<lookupStruct> {
		static byte[] commonByteArray = new byte[0];
		private static final int DEFAULT_HASHCODE = 1;
		private static final int PRIME = 31;
		private int hashCode = DEFAULT_HASHCODE;
		public boolean hashCodeDirty = true;

		int ID_LOOKUP1;

		String LABEL_LOOKUP1;

		@Override
		public int hashCode() {
			if (this.hashCodeDirty) {
				final int prime = PRIME;
				int result = DEFAULT_HASHCODE;

				result = prime * result + (int) this.ID_LOOKUP1;

				this.hashCode = result;
				this.hashCodeDirty = false;
			}
			return this.hashCode;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final lookupStruct other = (lookupStruct) obj;

			if (this.ID_LOOKUP1 != other.ID_LOOKUP1)
				return false;

			return true;
		}

		public void copyDataTo(lookupStruct other) {

			other.ID_LOOKUP1 = this.ID_LOOKUP1;
			other.LABEL_LOOKUP1 = this.LABEL_LOOKUP1;

		}

		public void copyKeysDataTo(lookupStruct other) {

			other.ID_LOOKUP1 = this.ID_LOOKUP1;

		}

		public void readKeysData(ObjectInputStream dis) {

			try {

				int length = 0;

				this.ID_LOOKUP1 = dis.readInt();

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		public void writeKeysData(ObjectOutputStream dos) {
			try {

				// int

				dos.writeInt(this.ID_LOOKUP1);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		/**
		 * Fill Values data by reading ObjectInputStream.
		 */
		public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
			try {

				int length = 0;

				length = dis.readInt();
				if (length == -1) {
					this.LABEL_LOOKUP1 = null;
				} else {
					byte[] byteArray = new byte[length];
					dis.read(byteArray);
					this.LABEL_LOOKUP1 = new String(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);

			}

		}

		/**
		 * Return a byte array which represents Values data.
		 */
		public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
			try {

				if (this.LABEL_LOOKUP1 == null) {
					dos.writeInt(-1);
				} else {
					byte[] byteArray = this.LABEL_LOOKUP1.getBytes();
					dos.writeInt(byteArray.length);
					dos.write(byteArray);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");

			sb.append("ID_LOOKUP1");
			sb.append("=");
			sb.append(String.valueOf(this.ID_LOOKUP1));

			sb.append(", ");

			sb.append("LABEL_LOOKUP1");
			sb.append("=");
			sb.append(String.valueOf(this.LABEL_LOOKUP1));

			sb.append("]");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(lookupStruct other) {

			int returnValue = -1;

			returnValue = checkNullsAndCompare(this.ID_LOOKUP1,
					other.ID_LOOKUP1);
			if (returnValue != 0) {
				return returnValue;
			}

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2
						.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			// if (this.ignoreCase) {
			return string1.compareToIgnoreCase(string2);
			// } else {
			// return string1.compareTo(string2);
			// }
		}

	}

	public void tFileInputDelimited_9Process() throws TalendException {
		globalMap.put("tFileInputDelimited_9_SUBPROCESS_STATE", 0);
		try {

			lookupStruct lookup = new lookupStruct();

			/*******************************************************************
			 * / [tAdvancedHash_lookup begin ] start
			 */

			ok_Hash.put("tAdvancedHash_lookup", false);
			start_Hash.put("tAdvancedHash_lookup", System.currentTimeMillis());
			currentComponent = "tAdvancedHash_lookup";

			runStat
					.updateStatOnConnection(
							"lookup"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 0, 0);

			org.talend.designer.components.commons.AdvancedLookup.MATCHING_MODE matchingModeEnum_lookup = org.talend.designer.components.commons.AdvancedLookup.MATCHING_MODE.ALL_MATCHES;

			org.talend.designer.components.persistent.PersistentSortedLookupManager<lookupStruct> tHash_Lookup_lookup = new org.talend.designer.components.persistent.PersistentSortedLookupManager<lookupStruct>(
					matchingModeEnum_lookup,
					context.data_output_dir + "/" + jobName
							+ "_tMapData_Lookup_lookup_",
					new org.talend.designer.components.persistent.IRowCreator() {
						public lookupStruct createRowInstance() {
							return new lookupStruct();
						}
					}

					, 10000000

			);

			tHash_Lookup_lookup.initPut();

			globalMap.put("tHash_Lookup_lookup", tHash_Lookup_lookup);

			/**
			 * [tAdvancedHash_lookup begin ] stop
			 */

			/*******************************************************************
			 * / [tFileInputDelimited_9 begin ] start
			 */

			ok_Hash.put("tFileInputDelimited_9", false);
			start_Hash.put("tFileInputDelimited_9", System.currentTimeMillis());
			currentComponent = "tFileInputDelimited_9";

			org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_9 = new org.talend.fileprocess.FileInputDelimited(
					context.getProperty("data_dir")
							+ context.getProperty("current_job_dir")
							+ "in/lookup.csv", "ISO-8859-15", ";", "\n", true,
					0, 0, -1, -1, false);
			while (fid_tFileInputDelimited_9.nextRecord()) {
				lookup = null;
				lookup = null;
				boolean whetherReject_tFileInputDelimited_9 = false;
				lookup = new lookupStruct();
				try {
					String temp_tFileInputDelimited_9 = "";
					temp_tFileInputDelimited_9 = fid_tFileInputDelimited_9.get(
							0).trim();
					if (temp_tFileInputDelimited_9.length() > 0) {
						lookup.ID_LOOKUP1 = ParserUtils
								.parseTo_int(temp_tFileInputDelimited_9);
					} else {
						throw new RuntimeException(
								"Value is empty for column : 'ID_LOOKUP1' in 'lookup' connection, value is invalid or this column should be nullable or have a default value.");
					}
					lookup.LABEL_LOOKUP1 = fid_tFileInputDelimited_9.get(1)
							.trim();

				} catch (Exception e) {
					whetherReject_tFileInputDelimited_9 = true;
					throw (e);
				}

				/**
				 * [tFileInputDelimited_9 begin ] stop
				 */
				/***************************************************************
				 * / [tFileInputDelimited_9 main ] start
				 */

				currentComponent = "tFileInputDelimited_9";

				/**
				 * [tFileInputDelimited_9 main ] stop
				 */
				// Start of branch "lookup"
				if (lookup != null) {

					/***********************************************************
					 * / [tAdvancedHash_lookup main ] start
					 */

					currentComponent = "tAdvancedHash_lookup";

					// lookup
					// lookup

					runStat
							.updateStatOnConnection(
									"lookup"
											+ (globalMap
													.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
													.get("PARALLEL_ITERATOR_THREAD_ID"))
													: ""), 1, 1);

					lookupStruct lookup_HashRow = tHash_Lookup_lookup
							.getNextFreeRow();

					lookup_HashRow.ID_LOOKUP1 = lookup.ID_LOOKUP1;
					lookup_HashRow.LABEL_LOOKUP1 = lookup.LABEL_LOOKUP1;
					tHash_Lookup_lookup.put(lookup_HashRow);

					/**
					 * [tAdvancedHash_lookup main ] stop
					 */

				} // End of branch "lookup"

				/***************************************************************
				 * / [tFileInputDelimited_9 end ] start
				 */

				currentComponent = "tFileInputDelimited_9";

			}
			fid_tFileInputDelimited_9.close();
			globalMap.put("tFileInputDelimited_9_NB_LINE",
					fid_tFileInputDelimited_9.getRowNumber());
			runStat
					.updateStatOnConnection(
							"lookup"
									+ (globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID") != null ? ("." + globalMap
											.get("PARALLEL_ITERATOR_THREAD_ID"))
											: ""), 2, 0);

			ok_Hash.put("tFileInputDelimited_9", true);
			end_Hash.put("tFileInputDelimited_9", System.currentTimeMillis());

			/**
			 * [tFileInputDelimited_9 end ] stop
			 */
			/*******************************************************************
			 * / [tAdvancedHash_lookup end ] start
			 */

			currentComponent = "tAdvancedHash_lookup";

			tHash_Lookup_lookup.endPut();

			ok_Hash.put("tAdvancedHash_lookup", true);
			end_Hash.put("tAdvancedHash_lookup", System.currentTimeMillis());

			/**
			 * [tAdvancedHash_lookup end ] stop
			 */

		} catch (Exception e) {

			throw new TalendException(this, e);
		}

		globalMap.put("tFileInputDelimited_9_SUBPROCESS_STATE", 1);
	}

	public static boolean watch = false;
	public static int portStats = 3334;
	public static int portTraces = 4334;
	public static String clientHost;
	public static String defaultClientHost = "localhost";
	public static String contextStr = "production";
	public static String pid = "0";
	public static String rootPid = null;
	public static String fatherPid = null;
	public static long startTime = 0;

	private static java.util.Properties context_param = new java.util.Properties();

	public static String status = "";

	public static void main(String[] args) {

		int exitCode = runJobInTOS(args);

		globalBuffer.clear();

		System.exit(exitCode);
	}

	public static String[][] runJob(String[] args) {

		int exitCode = runJobInTOS(args);
		String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

		globalBuffer.clear();

		return bufferValue;
	}

	public static synchronized int runJobInTOS(String[] args) {

		init();

		String lastStr = "";
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--context_param")) {
				lastStr = arg;
			} else if (lastStr.equals("")) {
				evalParam(arg);
			} else {
				evalParam(lastStr + " " + arg);
				lastStr = "";
			}
		}

		if (clientHost == null) {
			clientHost = defaultClientHost;
		}

		pid = TalendString.getAsciiRandomString(6);
		if (rootPid == null) {
			rootPid = pid;
		}
		if (fatherPid == null) {
			fatherPid = pid;
		}

		try {
			java.io.InputStream inContext = Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk.class
					.getClassLoader()
					.getResourceAsStream(
							"java_project_8/bug4108_tmap_with_parallelized_iterate_all_matches_storeondisk_0_1/contexts/Default.properties");
			if (inContext != null) {
				defaultProps.load(inContext);
				inContext.close();
				context = new ContextProperties(defaultProps);
			}

			if (contextStr.compareTo("Default") != 0) {
				inContext = Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk.class
						.getClassLoader()
						.getResourceAsStream(
								"java_project_8/bug4108_tmap_with_parallelized_iterate_all_matches_storeondisk_0_1/contexts/"
										+ contextStr + ".properties");
				if (inContext != null) {
					context.load(inContext);
					inContext.close();
				}
			}

			if (!context_param.isEmpty()) {
				context.putAll(context_param);
			}

			context.param_file_path = (String) context
					.getProperty("param_file_path");

			context.data_dir = (String) context.getProperty("data_dir");

			context.data_output_dir = (String) context
					.getProperty("data_output_dir");

			context.result_host = (String) context.getProperty("result_host");

			context.result_port = (String) context.getProperty("result_port");

			context.result_database = (String) context
					.getProperty("result_database");

			context.result_username = (String) context
					.getProperty("result_username");

			context.result_password = (String) context
					.getProperty("result_password");

			context.result_table = (String) context.getProperty("result_table");

			context.mysql_host = (String) context.getProperty("mysql_host");

			context.mysql_port = (String) context.getProperty("mysql_port");

			context.mysql_schema = (String) context.getProperty("mysql_schema");

			context.mysql_username = (String) context
					.getProperty("mysql_username");

			context.mysql_password = (String) context
					.getProperty("mysql_password");

			context.current_job_dir = (String) context
					.getProperty("current_job_dir");

		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		try {
			runStat.startThreadStat(clientHost, portStats);
		} catch (java.io.IOException ioException) {
			ioException.printStackTrace();
		}

		long startUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		long endUsedMemory = 0;
		long end = 0;

		startTime = System.currentTimeMillis();
		final Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDiskClass = new Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk();

		try {
			errorCode = null;
			Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDiskClass
					.tFileInputDelimited_2Process();
			status = "end";
		} catch (TalendException e_tFileInputDelimited_2) {
			status = "failure";
			e_tFileInputDelimited_2.printStackTrace();

		} finally {
		}

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory()
				- Runtime.getRuntime().freeMemory();
		if (false) {
			System.out
					.println((endUsedMemory - startUsedMemory)
							+ " bytes memory increase when running : Bug4108_tMap_with_parallelized_iterate_ALL_MATCHES_storeOnDisk");
		}

		runStat.stopThreadStat();

		reset();

		if (errorCode == null) {
			return status != null && status.equals("failure") ? 1 : 0;
		} else {
			return errorCode.intValue();
		}
	}

	public static void evalParam(String arg) {
		if (arg.startsWith("--watch")) {
			watch = true;
		} else if (arg.startsWith("--stat_port=")) {
			portStats = Integer.parseInt(arg.substring(12));
		} else if (arg.startsWith("--trace_port=")) {
			portTraces = Integer.parseInt(arg.substring(13));
		} else if (arg.startsWith("--client_host=")) {
			clientHost = arg.substring(14);
		} else if (arg.startsWith("--context=")) {
			contextStr = arg.substring(10);
		} else if (arg.startsWith("--father_pid=")) {
			fatherPid = arg.substring(13);
		} else if (arg.startsWith("--root_pid=")) {
			rootPid = arg.substring(11);
		} else if (arg.startsWith("--context_param")) {
			String keyValue = arg.substring(16);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				context_param.put(keyValue.substring(0, index), keyValue
						.substring(index + 1));
			}
		}

	}

	private static void init() {
		errorCode = null;
		status = "";
	}

	private static void reset() {

		defaultProps.clear();
		context.clear();
		currentComponent = "";
		start_Hash.clear();
		end_Hash.clear();
		ok_Hash.clear();
		globalMap.clear();
		watch = false;
		portStats = 3334;
		portTraces = 4334;
		clientHost = null;
		defaultClientHost = "localhost";
		contextStr = "production";
		pid = "0";
		rootPid = null;
		fatherPid = null;
		context_param.clear();
		System.gc();
	}
}
/*******************************************************************************
 * 173928 characters generated by Talend OpenStudio on the 10 juin 2008 21:51:27
 * CEST
 ******************************************************************************/
