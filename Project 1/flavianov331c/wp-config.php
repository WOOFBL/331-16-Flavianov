<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the installation.
 * You don't have to use the website, you can copy this file to "wp-config.php"
 * and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * Database settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://developer.wordpress.org/advanced-administration/wordpress/wp-config/
 *
 * @package WordPress
 */

// ** Database settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'flavianov' );

/** Database username */
define( 'DB_USER', 'root' );

/** Database password */
define( 'DB_PASSWORD', '' );

/** Database hostname */
define( 'DB_HOST', 'localhost' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication unique keys and salts.
 *
 * Change these to different unique phrases! You can generate these using
 * the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
 *
 * You can change these at any point in time to invalidate all existing cookies.
 * This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'V0?Z!|O^62]lj A&m)}D>]WL>j:ZtW<uV$=ab_vT&nZ-q,&BrQMXX3hFwmM9Z8sr' );
define( 'SECURE_AUTH_KEY',  '}tC=zPJ*@]Ckw{+HCR)WLbGiF&9qNYUdtholRJcPBd_hJVJ7R8R`ce`1,Jc3Bw,C' );
define( 'LOGGED_IN_KEY',    'j=MxvWESvYCE@^/R&S9,)9vyb8C3`SRQEf,OUF/7yZ&/T*PL_M|QD-4trI)i)6:)' );
define( 'NONCE_KEY',        '{CQ_WCf=n$k?U[FrIKiqvss8jBDsF-K|zg?W`G+N<)}8yzT72YKobq>B4lFW!msS' );
define( 'AUTH_SALT',        'L%jRf|`;7FntI.:89r@qpKr4B3@uWk|Jn5J|Wc93=-L-os]Gd1j%)@Pua1_A2V1.' );
define( 'SECURE_AUTH_SALT', '$FM:z[M:sf!#.Y`_Zq<y7?4UhVg0n#GqeU9+?)khBJ|$fg]> E#Ci;*Va!iRb!v7' );
define( 'LOGGED_IN_SALT',   '}3-LvgcToF2t(HM9E@LB-oGI{. v.rgFpoz%VJ.N,8v!E:*U+pP$iBpUW@}1~7qv' );
define( 'NONCE_SALT',       'O8S`IOU*ACR6[dILP/=+u3b%na8XzJ5~fk6SA]St.my4y1Skt^_>e65KYd$]?#v#' );

/**#@-*/

/**
 * WordPress database table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 *
 * At the installation time, database tables are created with the specified prefix.
 * Changing this value after WordPress is installed will make your site think
 * it has not been installed.
 *
 * @link https://developer.wordpress.org/advanced-administration/wordpress/wp-config/#table-prefix
 */
$table_prefix = 'cw_331';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://developer.wordpress.org/advanced-administration/debug/debug-wordpress/
 */
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
