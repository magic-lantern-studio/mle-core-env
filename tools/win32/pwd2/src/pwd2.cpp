// Include system header files.
#include <direct.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

void main( void )
{
   char buffer[_MAX_PATH];
   unsigned int i;

   /* Get the current working directory: */
   if ( _getcwd( buffer, _MAX_PATH ) == NULL )
   {
      perror( "_getcwd error" );
	  exit(1);
   }
   
   for (i = 0; i < strlen(buffer); i++)
   {
      if (buffer[i] == '\\')
      {
         buffer[i] = '/';
      }
   }

   fprintf(stdout, "%s", buffer );
   fflush(stdout);
}
