/**
 * @file tounix.c
 *
 * @brief remove <cr>
 *
 * This program converts DOS files to Unix files.
 * Typical execution in a directory
 *     tounix *
 * converts all files run this on the Unix side, not on DOS
 */

// Include system header files.
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  FILE *inp;
  FILE *tmp;
  int achar;
  int cr=13;
  int lchar=15;
  int esent=255;
  int mone=-1;
  int i;
  char tmpName[] = "ToUnix.Tmp";

  if (argc < 2)
  {
    printf("need file(s) to remove <cr> \n");
    exit(1);
  }

  remove(tmpName);

  for (i=1; i<argc; i++)
  {  
    inp = fopen(argv[i],"r+");
    if (inp==NULL)
    {
      printf("can not open for read/write %s\n", argv[i]);
      exit(1);
    }
    tmp = fopen(tmpName,"w+");
    if (tmp==NULL)
    {
      printf("can not open for read/write %s\n", tmpName);
      exit(1);
    }
    while (!feof(inp))
    {
      achar=fgetc(inp);
      if (achar!=cr && achar!=esent && achar!=lchar && achar!=mone)
      {
          fputc(achar,tmp);
      }
    }
    fclose(inp);
    fclose(tmp);
    remove(argv[i]);
    rename(tmpName,argv[i]);
  }

  return 0;
}
